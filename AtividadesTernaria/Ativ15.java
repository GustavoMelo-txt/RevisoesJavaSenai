package AtividadesTernaria;

import java.util.Scanner;

public class Ativ15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        
        String result = (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz" : String.valueOf(number);
        System.out.println(result);
        
        sc.close();
    }
}
