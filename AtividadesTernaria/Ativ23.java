package AtividadesTernaria;

import java.util.Scanner;

public class Ativ23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a password: ");
        String pass = sc.next();

        String result = (pass.length() >= 8) ? "Your password is valid." : "The password is invalid(too short).";
        System.out.println(result);
        
        sc.close();
    }
}
