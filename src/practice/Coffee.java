package practice;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee = 10;
        System.out.print("가진 돈을 입력해주세요 : ");
        int money = s.nextInt();

        while (coffee != 0) {
            System.out.print("커피를 드시겠습니까? (500원, y/n)");
            String a = s.next();
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다");
                System.out.println("프로그램을 종료하겠습니다");
            }
            if (a == "n") {
                System.out.println("프로그램을 종료하겠습니다");
                break;
            }
            if (money <= 500) {
                System.out.println("잔액이 부족합니다");
                System.out.println("프로그램을 종료하겠습니다");
                break;
            }
            System.out.print("커피를 몇잔 드시겠습니까?");
            int count = s.nextInt();
            if (count * 500 >= money) {
                System.out.println("잔액이 부족합니다 다시 입력해주세요");
            }
            else {
                money -= count * 500;
                System.out.println("주문하신 커피 " + count + "잔 나왔습니다");
                System.out.println("현재 남은 돈은 " + money + "원 입니다.");
                System.out.println();
                System.out.println("--------------------------------------");
                System.out.println();
            }
        }
    }
}
