package javastudy;

public class If2 {
    public static void main() {
        int score = 101; // and=&&, or=||
        char grade;
        if (score >= 100 || score <= 0) {
            grade = 'X';
        }
        else if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        System.out.println(grade);
    }
}
