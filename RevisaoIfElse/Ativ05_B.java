package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ05_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero de 1 até 30: ");
        int numero = sc.nextInt();

        if (numero > 0 && numero <= 10){
            System.out.printf("\nO numero %d pertence ao grupo A\n", numero);
        } else if (numero > 10 && numero <= 20) {
            System.out.printf("\nO numero %d pertence ao grupo B\n", numero);
        } else if (numero > 20 && numero <= 30){
            System.out.printf("\nO numero %d pertence ao grupo C\n", numero);
        } else {
            System.out.println("\nO numero inserido não esta entre 1 até 30.\nNumero: " + numero);
        }

        sc.close();
    }
}
