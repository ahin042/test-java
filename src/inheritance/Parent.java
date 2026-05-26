package inheritance;

public class Parent {
    private static int age;
    private String name;

    public Parent() { //생성자 1
        name = "123";
        age = 1;
    }

    public int getAge() {//메서드
        return age;
    }

    public String getName() {//메서드
        return name;
    }

    public Parent(String name, int age) {//생성자 2
        this.name = name;
        this.age = age;
    }
}