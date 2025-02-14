package GustavoJavaDoWhile;

import java.util.Scanner;

public class Ativ45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int numero1 = 1, numero2 = 1, soma = 0;

        System.out.print("Insira a quantidade desejada da sequencia de Fibonacci: ");
        int quantidade = sc.nextInt();

        System.out.println("\nPrimeiros " + quantidade + " numeros da sequencia de Fibonacci: \n1\n1");
        do {
            soma = numero1 + numero2;
            numero2 = numero1;
            numero1 = soma;
            System.out.println(soma);
            i++;
        } while (i < quantidade);

        sc.close();
    }
}
