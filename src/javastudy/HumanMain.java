package javastudy;

public class HumanMain {
    public static void main(String[] args) {
        int a = 10;
        Human human = new Human();

        human.headCount = 1;
        human.eyeCount = 2;
        human.armCount = 2;
        human.legCount = 2;
//        System.out.println(human.headCount);
//        System.out.println(human.eyeCount);
//        System.out.println(human.armCount);
//        System.out.println(human.legCount);
//
//        human.printHuman(human);

        human.printThis();
    }
}
//접근제어지시자: public, private, protected, default


//