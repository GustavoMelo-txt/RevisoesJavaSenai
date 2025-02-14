package AtividadesTernaria;

import java.util.Scanner;

public class Ativ04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        
        String result = (number % 5 == 0) ? "Multiple of 5." : "Not a multiple of 5.";
        System.out.println(result);
        
        sc.close();
    }
}
