package own;

public class InstanceMethod {
    static class Dog {
        String name;

        void bark() {  // 인스턴스 메소드
            System.out.println(name + ": 왈왈!");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "멍멍이";
        d.bark();
    }
}
