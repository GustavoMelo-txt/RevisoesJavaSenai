package GustavoMatheusJava;

import java.util.Random;
import java.util.Scanner;

public class Ativ08_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random sorteio = new Random();
        int numeroSorteado = sorteio.nextInt(10) + 1;

        System.out.print("Digite um numero de 1 ate 10: ");
        int numero = sc.nextInt();

        if (numero == numeroSorteado) {
            System.out.println("\nVocê acertou!!");
        } else {
            System.out.println("\nVocê errou...\nNumero sorteado: " + numeroSorteado);
        }

        sc.close();
    }
}
