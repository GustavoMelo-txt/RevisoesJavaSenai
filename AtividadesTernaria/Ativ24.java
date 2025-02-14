package AtividadesTernaria;

import java.util.Scanner;

public class Ativ24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a number: ");
        int number = sc.nextInt();

        int dividersSum = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            dividersSum += (number % i == 0) ? i : 0;
        }

        String result = (dividersSum == number) ? "Perfect." : "Not perfect.";
        System.out.println(result);

        sc.close();
    }
}
