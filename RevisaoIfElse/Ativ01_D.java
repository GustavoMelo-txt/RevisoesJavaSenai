package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("\nVocê pode votar!");
        } else {
            System.out.println("\nVocê não pode votar...");
        }

        sc.close();
    }
}
