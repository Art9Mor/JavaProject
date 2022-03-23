public class ForLoop {
    public static void fun() {
        for (int i = 100; i >= 1; i--) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Four Loop numbers");
        fun();
    }
}
