package AtividadesTernaria;

import java.util.Scanner;

public class Ativ28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        
        String result = (number >= 20 && number <= 30) ? "The number is in the interval." : "The number is not in the interval.";
        System.out.println(result);
        
        sc.close();
    }
}
