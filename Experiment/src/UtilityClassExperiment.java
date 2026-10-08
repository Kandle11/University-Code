import java.math.BigInteger;
import java.util.StringTokenizer;

class StringDemo {
    public void demo() {
        String str = "  Hello, Java World!  ";
        System.out.println("原始字符串: [" + str + "]");
        System.out.println("索引5处的字符: " + str.charAt(5));
        System.out.println("是否等于'Hello Java': " + str.equals("Hello Java"));
        String[] parts = str.trim().split(",");
        System.out.println("按逗号分割后:");
        for (String part : parts) {
            System.out.println("  " + part.trim());
        }
        String replaced = str.replace("Java", "Programming");
        System.out.println("替换后: " + replaced);
        System.out.println("去除首尾空白后: [" + str.trim() + "]");
        System.out.println("截取7-11: " + str.substring(7, 12));
    }
}

class TokenizerDemo {
    public void tokenizerMethod() {
        String text = "Java,Python C++;JavaScript Ruby";
        StringTokenizer tokenizer = new StringTokenizer(text, " ,;");
        System.out.println("使用StringTokenizer拆分结果:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println("  " + tokenizer.nextToken());
        }
    }

    public void regexMethod() {
        String email1 = "student123@fosu.edu.cn";
        String email2 = "invalid.email@";
        String regex = "^[a-zA-Z0-9_]+@[a-zA-Z0-9]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?$";
        System.out.println(email1 + " 格式合法: " + email1.matches(regex));
        System.out.println(email2 + " 格式合法: " + email2.matches(regex));
    }
}

class BigIntegerDemo {
    public BigInteger add(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    public BigInteger subtract(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    public BigInteger multiply(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    public BigInteger divide(BigInteger a, BigInteger b) {
        return a.divide(b);
    }

    public BigInteger mod(BigInteger a, BigInteger b) {
        return a.mod(b);
    }
}

public class UtilityClassExperiment {
    public static void main(String[] args) {
        System.out.println("=== String类操作演示 ===");
        StringDemo stringDemo = new StringDemo();
        stringDemo.demo();

        System.out.println("\n=== StringTokenizer与正则表达式演示 ===");
        TokenizerDemo tokenizerDemo = new TokenizerDemo();
        tokenizerDemo.tokenizerMethod();
        tokenizerDemo.regexMethod();

        System.out.println("\n=== BigInteger大整数运算演示 ===");
        BigIntegerDemo bigIntDemo = new BigIntegerDemo();
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("加法: " + bigIntDemo.add(num1, num2));
        System.out.println("减法: " + bigIntDemo.subtract(num1, num2));
        System.out.println("乘法: " + bigIntDemo.multiply(num1, num2));
        System.out.println("除法: " + bigIntDemo.divide(num2, num1));
        System.out.println("取模: " + bigIntDemo.mod(num2, num1));
    }
}