package AtividadesTernaria;

import java.util.Scanner;

public class Ativ26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in your age: ");
        int age = sc.nextInt();
        
        String result = (age >= 16) ? "You can vote." : "You can not vote.";
        System.out.println(result);
        
        sc.close();
    }
}
