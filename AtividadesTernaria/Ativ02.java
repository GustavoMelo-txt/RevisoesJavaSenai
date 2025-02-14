package AtividadesTernaria;

import java.util.Scanner;

public class Ativ02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in your age: ");
        int age = sc.nextInt();
        
        String result = (age >= 18) ? "You are not underage." : "You are underage.";
        System.out.println(result);
        
        sc.close();
    }
}
