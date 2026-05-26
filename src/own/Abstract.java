package own;

public class Abstract {
    abstract class Animal {
        String name;

        // 일반 메서드 (구현 O)
        void breathe() {
            System.out.println("숨을 쉰다");
        }

        // 추상 메서드 (구현 X, 자식이 반드시 구현해야 함)
        abstract void sound();
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("멍멍!");// 반드시 구현해야 함
        }
    }

    public static void main(String[] args) {
        Abstract outer = new Abstract();
        Dog d = outer.new Dog();
        d.sound(); // "
        d.breathe();
    }
}
