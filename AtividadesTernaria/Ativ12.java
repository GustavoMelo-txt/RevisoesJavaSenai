package AtividadesTernaria;

import java.util.Scanner;

public class Ativ12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();
        
        String result = (number % 2 == 0 && number > 0) ? "Even and positive." :(number % 2 == 0 && number < 0) ? "Even and negative." : (number % 2 != 0 && number > 0) ? "Odd and positive." : (number % 2 != 0 && number < 0) ? "Odd and negative." : "Zero.";
        System.out.println(result);
        
        sc.close();
    }
}
