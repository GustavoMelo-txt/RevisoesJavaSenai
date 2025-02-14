package AtividadesTernaria;

import java.util.Scanner;

public class Ativ14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        
        String result = (number >= 10 && number <= 50) ? "The number is in the interval." : "The number is not in the interval.";
        System.out.println(result);
        
        sc.close();
    }
}
