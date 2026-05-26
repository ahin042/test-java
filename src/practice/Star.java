package practice;

public class Star {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int a = 6 - i; a >= 1; a--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int b = 2 * i - 3; b >= 1; b--) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int a = i; a <= 5; a++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int a = 2 * i - 3; a >= 1; a--) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}