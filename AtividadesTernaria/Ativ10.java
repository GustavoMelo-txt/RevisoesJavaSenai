package AtividadesTernaria;

import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();

        String result = (number > 100) ? "Higher." : "Lower.";
        System.out.println(result);
        sc.close();
    }
}
