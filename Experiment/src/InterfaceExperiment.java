interface Operation {
    int compute(int a, int b);
}

// 实现类1：加法
class AddImpl implements Operation {
    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}

// 实现类2：减法
class SubtractImpl implements Operation {
    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}

public class InterfaceExperiment {
    public static void main(String[] args) {
        // 1. 实现接口的类并调用方法
        AddImpl addObj = new AddImpl();
        System.out.println("加法（类对象调用）：" + addObj.compute(10, 5));

        // 2. 接口回调
        Operation op = new SubtractImpl();
        System.out.println("减法（接口回调）：" + op.compute(10, 5));

        // 3. Lambda表达式（实现接口）
        Operation multiply = (a, b) -> a * b;
        System.out.println("乘法（Lambda表达式）：" + multiply.compute(10, 5));

        // 4. 借助接口实现多态（接口数组）
        Operation[] operations = {
                new AddImpl(),
                new SubtractImpl(),
                (a, b) -> a * b,
                (a, b) -> a / b
        };
        int x = 20, y = 4;
        for (Operation o : operations) {
            System.out.println("多态结果：" + o.compute(x, y));
        }
    }
}