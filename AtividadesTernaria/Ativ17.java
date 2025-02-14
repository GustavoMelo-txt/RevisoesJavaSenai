package AtividadesTernaria;

import java.util.Scanner;

public class Ativ17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in your age: ");
        int age = sc.nextInt();
        System.out.println("Are you a student? ");
        char student = sc.next().toLowerCase().charAt(0);
        
        String result = (age >= 60 || student == 'y') ? "You are qualified for a discount." : "You are not qualified for a discount.";
        System.out.println(result);

        sc.close();
    }
}
