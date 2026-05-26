package inheritance;

public class ParentMain {
    public static void main(String[] args) {

        Parent p = new Parent("123", 1);
        Parent p2 = new Parent("권아인",17);
        Parent pp = new Parent();

        System.out.println();
        System.out.print(p.getName());
        System.out.print(" ");
        System.out.println(p.getAge());

        System.out.print(p2.getName());
        System.out.print(" ");
        System.out.println(p2.getAge());

        System.out.print(pp.getName());
        System.out.print(" ");
        System.out.println(pp.getAge());
    }
}