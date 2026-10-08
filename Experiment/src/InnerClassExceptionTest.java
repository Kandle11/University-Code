class Outer {
    private String name = "外部类成员";

    class Inner {
        private String innerName = "内部类成员";

        public void display() {
            System.out.println("内部类访问：" + name);
            System.out.println("内部类自身：" + innerName);
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}

class ScoreOutOfRangeException extends Exception {
    public ScoreOutOfRangeException(String message) {
        super(message);
    }
}

class StudentScore {
    private int score;

    public void setScore(int score) throws ScoreOutOfRangeException {
        if (score < 0 || score > 100) {
            throw new ScoreOutOfRangeException("成绩必须在0~100之间，当前值为：" + score);
        }
        this.score = score;
        System.out.println("成绩设置成功：" + score);
    }

    public int getScore() {
        return score;
    }
}

public class InnerClassExceptionTest {
    public static void main(String[] args) {
        System.out.println("=== 内部类测试 ===");
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
        inner.display();

        Outer.Inner inner2 = outer.new Inner();
        inner2.display();

        System.out.println("\n=== 异常类测试 ===");
        StudentScore student = new StudentScore();

        try {
            student.setScore(95);
            student.setScore(105);
        } catch (ScoreOutOfRangeException e) {
            System.out.println("捕获异常：" + e.getMessage());
        }

        try {
            student.setScore(-10);
        } catch (ScoreOutOfRangeException e) {
            System.out.println("捕获异常：" + e.getMessage());
        }
    }
}
