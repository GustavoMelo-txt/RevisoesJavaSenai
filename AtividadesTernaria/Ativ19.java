package AtividadesTernaria;

import java.util.Scanner;

public class Ativ19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        
        String result = (number % 2 == 0 || number % 3 == 0) ? "Divisible" : "Not divisible.";
        System.out.println(result);
        
        sc.close();
    }
}
