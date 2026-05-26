package own;

public class Inter {
    interface Flyable {
        void fly();  // 모두 추상 메소드
    }

    interface Swimmable {
        void swim();
    }

    // 인터페이스는 다중 구현 가능! (클래스는 단일 상속만)
    class Duck implements Flyable, Swimmable {
        public void fly()  { System.out.println("날다!"); }
        public void swim() { System.out.println("헤엄친다!"); }
    }
}
