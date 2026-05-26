package javastudy;

public class AccountMain {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        a1.name = "A";
        a2.name = "B";
        a3.name = "C";

        System.out.println(a1.count[0]);
        System.out.println(a2.count[0]);
        a1.count[0] = 4;
        System.out.println(a3.count[0]);

        System.out.println(a1.name);
        System.out.println(a2.name);
        System.out.println(a3.name);

        a1.setChange(10);
        a2.setChange(100);
        a3.setChange(1000);
        System.out.println(a1.getChange());
        System.out.println(a2.getChange());
        System.out.println(a3.getChange());
    }
}
