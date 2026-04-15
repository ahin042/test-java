package javastudy;

import java.util.Scanner;

public class Testp {
    public static int plus(int a, int c) {
        return a + c;
    }
    public static int minus(int a, int c) {
        return a - c;
    }
    public static int multiple(int a, int c) {
        return a * c;
    }
    public static int divide(int a, int c) {
        return a / c;
    }
    public static int factorial(int a) {
        int j = 1;
        for (int i = 1; i <= a; i++) {
            j *= i;
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int c = 0;
            System.out.print("연산자 입력 : ");
            char b = scanner.next().charAt(0);
            if (b == 'x') {
                System.out.println("종료하겠습니다.");
                break;
            }
            System.out.print("첫번째 수 입력 : ");
            int a = scanner.nextInt();
            if (b == '!') {
                System.out.println(factorial(a));
            }
            else {
                System.out.print("두번째 수 입력 : ");
                c = scanner.nextInt();
            }
            switch (b) {
                case '+':
                    System.out.println(plus(a, c));
                    break;
                case '-':
                    System.out.println(minus(a, c));
                    break;
                case '*':
                    c = scanner.nextInt();
                    System.out.println(multiple(a, c));
                    break;
                case '/':
                    c = scanner.nextInt();
                    if (c == 0) {
                        System.out.println("잘못된 입력값입니다.");
                    } else {
                        System.out.println(divide(a,c));
                    }
                    break;
                default:
                    System.out.println("잘못된 입력값입니다.");
                    break;
            }
        }
    }
}