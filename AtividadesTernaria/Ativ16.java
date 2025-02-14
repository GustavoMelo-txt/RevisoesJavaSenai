package AtividadesTernaria;

import java.util.Scanner;

public class Ativ16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a boolean value ('true' or 'false'): ");
        boolean value = sc.nextBoolean();

        String result = (value) ? "Yes." : "No.";
        System.out.println(result);

        sc.close();
    }
}
