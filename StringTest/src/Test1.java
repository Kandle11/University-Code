public class Test1 {
    public static void main(String[] args) {
        String hello = "你好";
        String testOne = "你" + "好";
        int address = System.identityHashCode("你好");
        System.out.printf("\"你好\"的引用:%x\n",address);
        address = System.identityHashCode(hello);
        System.out.printf("hello的引用:%x\n",address);
        address = System.identityHashCode(testOne);
        System.out.printf("testOne的引用:%x\n",address);
    }
}
