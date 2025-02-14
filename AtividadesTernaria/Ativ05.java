package AtividadesTernaria;

import java.util.Scanner;

public class Ativ05 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Type in a year: ");
        int year = sc.nextInt();
        
        String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap year." : "Not a leap year.";
        System.out.println(result);
        
        sc.close();
    }
}
