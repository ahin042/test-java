package javastudy;

public class If {
    static void main() {
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("같다");
        }
        else if (a != b) {
            System.out.println("다르다");
        }
        else {
            System.out.println("숫자가 아니다");
        }

        switch (a) {
            case 1:
                System.out.println("1이다.");
                break;
            case 10:
                System.out.println("10이다.");
                break;
            default:
                System.out.println("나머지");
                break;
        }
    }
}
