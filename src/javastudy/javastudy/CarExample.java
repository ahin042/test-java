package javastudy.javastudy;
import java.util.Scanner;

class Car{
    public String company;
    public String model;
    public String color;
    public int speed;
    String money;


    public Car(String company, String model, String color, int speed, String money) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.money = money;
    }
}

public class CarExample {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("자동차 구매");
        System.out.print("회사입력 : ");
        String company = scanner.nextLine();
        System.out.print("모델명입력 : ");
        String model = scanner.nextLine();
        System.out.print("색깔입력 : ");
        String color = scanner.nextLine();
        System.out.print("최고속도입력 : ");
        int speed = scanner.nextInt();
        System.out.print("구매금액입력 : ");
        String money = scanner.next();
        System.out.println("자동차를 구매하셨습니다.");
        System.out.println("구메내역");
        Car c1 = new Car(company,model,color,speed,money);
        System.out.print("제작회사 : ");
        System.out.println(c1.company);
        System.out.print("모델명 : ");
        System.out.println(c1.model);
        System.out.print("색깔 : ");
        System.out.println(c1.color);
        System.out.print("최고속도 : ");
        System.out.println(c1.speed);
        System.out.print("구매금액 : ");
        System.out.println(c1.money);
    }
}
