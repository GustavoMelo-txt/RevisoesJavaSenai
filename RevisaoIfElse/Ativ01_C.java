package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        System.out.print("Insira o 1° número: ");
        n1 = sc.nextInt();

        System.out.print("Insira o 2° número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("\nO 1° número é maior que o 2° número.");
        } else if (n1 < n2) {
            System.out.println("\nO 2° número é maior que o 1° número.");
        } else {
            System.out.println("\nOs números são iguais.");
        }

        sc.close();
    }
}
