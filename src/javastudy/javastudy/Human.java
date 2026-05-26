package javastudy.javastudy;

public class Human {
    int headCount;
    int eyeCount;
    int armCount;
    int legCount;

    public void printHuman(Human h) {
        System.out.println(h.headCount);
        System.out.println(h.eyeCount);
        System.out.println(h.armCount);
        System.out.println(h.legCount);
    }

    public void printThis() {
        System.out.println(this.headCount);
        System.out.println(this.eyeCount);
        System.out.println(this.armCount);
        System.out.println(this.legCount);
    }
}