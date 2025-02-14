package AtividadesTernaria;

import java.util.Scanner;

public class Ativ25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a week day: ");
        String day = sc.nextLine().toLowerCase();

        String result = (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) ? "Bussiness day." : "Weekend.";
        System.out.println(result);
        
        sc.close();
    }
}
