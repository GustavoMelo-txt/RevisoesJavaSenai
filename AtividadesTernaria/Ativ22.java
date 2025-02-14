package AtividadesTernaria;

import java.util.Scanner;

public class Ativ22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in the product price: ");
        double price = sc.nextDouble();

        String result = (price >= 100) ? "This product has free shipping.": "This product does not have free shipping.";
        System.out.println(result);
        sc.close();
    }
}
