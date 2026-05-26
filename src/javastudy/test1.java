package javastudy;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 반지름 입력 : ");
        int a = scanner.nextInt();
        System.out.print("원넓이 : ");
        System.out.println(Math.pow(a, 2) * 3.14);
    }
}
