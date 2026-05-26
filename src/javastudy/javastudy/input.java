package javastudy.javastudy;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        float f = scanner.nextFloat();

        String string = scanner.next();

        System.out.println(a);
        System.out.println(f);
        System.out.println(string);
        System.out.println(a + f);
    }
}
