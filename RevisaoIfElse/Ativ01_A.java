package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("\nO número é positivo.");
        } else {
            System.out.println("\nO número é negativo.");
        }

    sc.close();
    }
}
