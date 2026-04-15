package javastudy;

public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a * b);
        if (a < b) {
            System.out.println("true");
        }
        switch (a) {
            case 1 :
                System.out.println(1);
            case 5 :
                System.out.println(5);
            case 10 :
                System.out.println(10);
        }
    }
}
