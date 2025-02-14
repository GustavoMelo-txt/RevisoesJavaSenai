package AtividadesTernaria;

import java.util.Scanner;

public class Ativ29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in your age: ");
        int age = sc.nextInt();

        String result = (age < 18) ? "You are an teen." : (age >= 18 || age < 60) ? "You are an adult." : "You are an elderly.";
        System.out.println(result);

        sc.close();
    }
}
