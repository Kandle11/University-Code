import java.util.*;

/**
 * 命题逻辑真值表求解器（完全修复版）
 * 功能：生成真值表、主析取/合取范式、等值判断
 */
public class PropositionLogicSolver {

    // 判断字符是否为运算符
    private static boolean isOperator(char c) {
        return "+-|&!()@".indexOf(c) != -1;
    }

    // 提取变元并排序（去重）
    private static String extractVars(String exp) {
        Set<Character> set = new TreeSet<>();
        for (char c : exp.toCharArray()) {
            if (!isOperator(c) && c != '@') {
                set.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) sb.append(c);
        return sb.toString();
    }

    // ==================== 算符优先求值 ====================

    // 优先级表（8x8）
    private static char priority(char op1, char op2) {
        String table = "><<<<<>>" +
                ">><<<<>>" +
                ">>><<<>>" +
                ">>>><<>>" +
                ">>>>><>>" +
                "<<<<<<=E" +
                ">>>>E>>>" +
                "<<<<<<E=";
        String ops = "+-|&!()@";
        int i1 = ops.indexOf(op1);
        int i2 = ops.indexOf(op2);
        return table.charAt(i1 * 8 + i2);
    }

    // 二元运算（所有参数和返回值都用 int，内部转为 boolean 运算）
    private static int operate(int x, char op, int y) {
        boolean bx = (x == 1);
        boolean by = (y == 1);
        boolean result;
        switch (op) {
            case '+':
                result = (bx == by); // 双条件：同真同假为真
                break;
            case '-':
                result = (!bx || by); // 条件：非x或y
                break;
            case '|':
                result = (bx || by);
                break;
            case '&':
                result = (bx && by);
                break;
            default:
                result = false;
        }
        return result ? 1 : 0;
    }

    // 计算单个赋值下的真值
    private static int calcValue(String exp, int[] vals, String vars) {
        Stack<Character> optr = new Stack<>();
        Stack<Integer> opnd = new Stack<>();
        optr.push('@');
        int idx = 0;
        char c = exp.charAt(idx);

        while (c != '@' || optr.peek() != '@') {
            if (!isOperator(c)) {
                int pos = vars.indexOf(c);
                opnd.push(vals[pos]);
                c = exp.charAt(++idx);
            } else {
                char p = priority(optr.peek(), c);
                if (p == '<') {
                    optr.push(c);
                    c = exp.charAt(++idx);
                } else if (p == '=') {
                    optr.pop();
                    c = exp.charAt(++idx);
                } else if (p == '>') {
                    char op = optr.pop();
                    if (op == '!') {
                        int a = opnd.pop();
                        opnd.push((a == 0) ? 1 : 0);
                    } else {
                        int a = opnd.pop();
                        int b = opnd.pop();
                        opnd.push(operate(b, op, a));
                    }
                    // 不移动c，继续处理新栈顶
                }
            }
        }
        return opnd.pop();
    }

    // ==================== 真值表生成 ====================

    public static int[] generateTruthTable(String exp, boolean print) {
        String vars = extractVars(exp);
        int n = vars.length();
        int m = (int) Math.pow(2, n);
        int[][] assign = new int[m][n];
        int[] F = new int[m];

        // 生成赋值（二进制枚举）
        for (int j = 0; j < n; j++) {
            int flag = 1;
            int period = (int) Math.pow(2, n - j - 1);
            for (int i = 0; i < m; i++) {
                if (i % period == 0) flag = 1 - flag;
                assign[i][j] = flag;
            }
        }

        // 计算每行真值
        for (int i = 0; i < m; i++) {
            F[i] = calcValue(exp, assign[i], vars);
        }

        if (print) {
            System.out.println("\n真值表：");
            for (char v : vars.toCharArray()) System.out.print(v + "\t");
            System.out.println(exp.replace("@", ""));
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) System.out.print(assign[i][j] + "\t");
                System.out.println(F[i]);
            }
        }
        return F;
    }

    // ==================== 主范式生成 ====================

    public static void printPrincipalForms(String exp, int[] F) {
        String vars = extractVars(exp);
        int n = vars.length();
        int m = (int) Math.pow(2, n);
        int[][] assign = new int[m][n];

        for (int j = 0; j < n; j++) {
            int flag = 1;
            int period = (int) Math.pow(2, n - j - 1);
            for (int i = 0; i < m; i++) {
                if (i % period == 0) flag = 1 - flag;
                assign[i][j] = flag;
            }
        }

        // 主析取范式
        List<String> dnfTerms = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (F[i] == 1) {
                StringBuilder term = new StringBuilder("(");
                for (int j = 0; j < n; j++) {
                    if (j > 0) term.append(" ∧ ");
                    if (assign[i][j] == 0) term.append("¬");
                    term.append(vars.charAt(j));
                }
                term.append(")");
                dnfTerms.add(term.toString());
            }
        }
        System.out.println("\n主析取范式：");
        if (dnfTerms.isEmpty()) {
            System.out.println("0（矛盾式，无成真赋值）");
        } else {
            System.out.println(String.join(" ∨ ", dnfTerms));
        }

        // 主合取范式
        List<String> cnfTerms = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            if (F[i] == 0) {
                StringBuilder term = new StringBuilder("(");
                for (int j = 0; j < n; j++) {
                    if (j > 0) term.append(" ∨ ");
                    if (assign[i][j] == 1) term.append("¬");
                    term.append(vars.charAt(j));
                }
                term.append(")");
                cnfTerms.add(term.toString());
            }
        }
        System.out.println("\n主合取范式：");
        if (cnfTerms.isEmpty()) {
            System.out.println("1（重言式，无成假赋值）");
        } else {
            System.out.println(String.join(" ∧ ", cnfTerms));
        }

        // 公式类型
        boolean allTrue = true, allFalse = true;
        for (int v : F) {
            if (v == 0) allTrue = false;
            if (v == 1) allFalse = false;
        }
        System.out.print("\n公式类型：");
        if (allTrue) System.out.println("重言式（永真式）");
        else if (allFalse) System.out.println("矛盾式（永假式）");
        else System.out.println("可满足式（非重言非矛盾）");
    }

    // ==================== 等值判断 ====================

    public static void checkEquivalence(String exp1, String exp2) {
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();
        for (char c : exp1.toCharArray()) if (!isOperator(c) && c != '@') set1.add(c);
        for (char c : exp2.toCharArray()) if (!isOperator(c) && c != '@') set2.add(c);

        Set<Character> union = new TreeSet<>();
        union.addAll(set1);
        union.addAll(set2);
        StringBuilder vars = new StringBuilder();
        for (char c : union) vars.append(c);

        int n = vars.length();
        int m = (int) Math.pow(2, n);
        int[][] assign = new int[m][n];

        for (int j = 0; j < n; j++) {
            int flag = 1;
            int period = (int) Math.pow(2, n - j - 1);
            for (int i = 0; i < m; i++) {
                if (i % period == 0) flag = 1 - flag;
                assign[i][j] = flag;
            }
        }

        int[] F1 = new int[m];
        int[] F2 = new int[m];

        for (int i = 0; i < m; i++) {
            StringBuilder vars1 = new StringBuilder();
            for (char c : set1) vars1.append(c);
            int[] vals1 = new int[set1.size()];
            int idx1 = 0;
            for (char c : set1) {
                int pos = vars.indexOf(String.valueOf(c));
                vals1[idx1++] = assign[i][pos];
            }
            F1[i] = calcValue(exp1, vals1, vars1.toString());

            StringBuilder vars2 = new StringBuilder();
            for (char c : set2) vars2.append(c);
            int[] vals2 = new int[set2.size()];
            int idx2 = 0;
            for (char c : set2) {
                int pos = vars.indexOf(String.valueOf(c));
                vals2[idx2++] = assign[i][pos];
            }
            F2[i] = calcValue(exp2, vals2, vars2.toString());
        }

        boolean equal = true;
        for (int i = 0; i < m; i++) {
            if (F1[i] != F2[i]) { equal = false; break; }
        }

        System.out.println("\n等值判断结果：");
        System.out.println("公式1: " + exp1.replace("@", ""));
        System.out.println("公式2: " + exp2.replace("@", ""));
        System.out.println(equal ? "✓ 两个公式在逻辑上等值" : "✗ 两个公式不等值");
    }

    // ==================== 主程序 ====================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("  命题逻辑真值表求解器");
        System.out.println("========================================");
        System.out.println("运算符说明：");
        System.out.println("  !  → 非");
        System.out.println("  &  → 合取（且）");
        System.out.println("  |  → 析取（或）");
        System.out.println("  -  → 条件（蕴含）");
        System.out.println("  +  → 双条件（等价）");
        System.out.println("变元请用单个大写字母表示，如 P、Q、R");
        System.out.println("示例公式：P-Q  或  (P|Q)&R  或  !(P&Q)");
        System.out.println("========================================\n");

        while (true) {
            System.out.println("请选择功能：");
            System.out.println("  1. 输入公式 → 输出真值表 & 主范式");
            System.out.println("  2. 判断两个公式是否等值");
            System.out.println("  3. 退出程序");
            System.out.print("请输入选项（1-3）：");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("请输入命题公式：");
                    String exp = sc.nextLine().trim();
                    if (!exp.endsWith("@")) exp = exp + "@";
                    int[] F = generateTruthTable(exp, true);
                    printPrincipalForms(exp, F);
                    System.out.println("\n按回车继续...");
                    sc.nextLine();
                    break;
                case "2":
                    System.out.print("请输入第一个公式：");
                    String e1 = sc.nextLine().trim();
                    if (!e1.endsWith("@")) e1 = e1 + "@";
                    System.out.print("请输入第二个公式：");
                    String e2 = sc.nextLine().trim();
                    if (!e2.endsWith("@")) e2 = e2 + "@";
                    checkEquivalence(e1, e2);
                    System.out.println("\n按回车继续...");
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("感谢使用，再见！");
                    sc.close();
                    return;
                default:
                    System.out.println("无效选项，请重新输入。");
                    break;
            }
            System.out.println();
        }
    }
}