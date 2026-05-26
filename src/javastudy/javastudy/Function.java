package javastudy.javastudy;

public class Function {
    public static void a() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static int b() {
        return 10;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static void print(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        a();

        System.out.println(b());

        System.out.println("a");

        System.out.println(add(2, 3));

        print(3);

        a();
    }
}
