package javastudy.javastudy;

public class If3 {
    public static void main() {
         // and=&&, or=||
        char grade = 'A';
        if (grade == 'A') {
            System.out.println("당신의 점수는 90~100점 사이입니다.");
        }
        else if (grade == 'B') {
            System.out.println("당신의 점수는 80~89점 사이입니다.");
        }
        else if (grade == 'C') {
            System.out.println("당신의 점수는 70~79점 사이입니다.");
        }
        else if (grade == 'D') {
            System.out.println("당신의 점수는 60~69점 사이입니다.");
        }
        else if (grade == 'E') {
            System.out.println("당신의 점수는 50~59점 사이입니다.");
        }
        else {
            System.out.println("당신의 점수는 49점 이하입니다.");
        }

        switch (grade) {
            case 'A' :
                System.out.println("당신의 점수는 90~100점 사이입니다.");
                break;
            case 'B' :
                System.out.println("당신의 점수는 80~890점 사이입니다.");
                break;
            case 'C' :
                System.out.println("당신의 점수는 70~79점 사이입니다.");
                break;
            case 'D' :
                System.out.println("당신의 점수는 60~69점 사이입니다.");
                break;
            case 'E' :
                System.out.println("당신의 점수는 50~59점 사이입니다.");
                break;
            default:
                System.out.println("당신의 점수는 49점 이하입니다.");
        }
    }
}