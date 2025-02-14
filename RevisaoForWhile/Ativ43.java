package GustavoJavaDoWhile;

import java.util.Scanner;

public class Ativ43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, i = 0;

        System.out.print("Insira quantos numeros serao digitados: ");
        int repeticoes = sc.nextInt();

        System.out.println("Insira " + repeticoes + " numeros: ");
        do {
            int numero = sc.nextInt();
            soma += numero;
            i++;
        } while (i < repeticoes);

        System.out.println("\nA soma dos números é: " + soma);

        sc.close();
    }
}
