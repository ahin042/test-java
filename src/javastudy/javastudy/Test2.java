package javastudy.javastudy;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test a1 = new Test();
        Test a2 = new Test();
        Test a3 = new Test();
        System.out.print("1번째 사람의 이름을 입력해주세요 : ");
        a1.name = scanner.next();
        System.out.print("2번째 사람의 이름을 입력해주세요 : ");
        a2.name = scanner.next();
        System.out.print("3번째 사람의 이름을 입력해주세요 : ");
        a3.name = scanner.next();

        for (int i = 1; i <= 3; i++) {
            System.out.print(i + "번째 사람의 점수를 입력해주세요 : ");
            a1.scores[i - 1] = scanner.nextInt();
        }

        System.out.println(a1.name + "의 점수는 " + a1.scores[0]);
        System.out.println(a2.name + "의 점수는 " + a2.scores[1]);
        System.out.println(a3.name + "의 점수는 " + a2.scores[2]);
    }
}
