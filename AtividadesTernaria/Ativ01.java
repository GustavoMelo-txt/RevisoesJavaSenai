package AtividadesTernaria;

import java.util.Scanner;

public class Ativ01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        
        String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";
        System.out.println(result);
        
        sc.close();
    }
}
