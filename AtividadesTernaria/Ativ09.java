package AtividadesTernaria;

import java.util.Scanner;

public class Ativ09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in two numbers: ");
        int number = sc.nextInt();
        int number2 = sc.nextInt();

        String result = (number > number2) ? "Higher." : "Lower or equal.";
        System.out.println(result);
        sc.close();
    }
}
