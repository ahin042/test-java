package practice;

public class For1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int a = 6 - i; a >= 1; a--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int a = i; a <= 5; a++) {
                System.out.print(" ");
            }
            for (int b = 2 * i - 1; b >= 1; b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}