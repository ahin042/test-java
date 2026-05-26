package own;

import java.util.Scanner;

public class PsetMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pset p1 = new Pset();

        p1.setName("ahin");
        p1.setPas("0422");

        System.out.print("아이디를 입력해주세요 :");
        String a = scanner.next();
        System.out.print("비밀번호를 입력해주세요 :");
        String b = scanner.next();

        if (a.equals(p1.getName())) {
            if (b.equals(p1.getPas())) {
                System.out.println("로그인 성공");
            }
            else {
                System.out.println("비밀번호가 다릅니다.");
            }
        }
        else if (a.equals(p1.getName()) && b.equals(p1.getPas())) {
            System.out.println("로그인 실패");
        }
        else  {
            System.out.println("아이디가 다릅니다.");
        }
    }
}
