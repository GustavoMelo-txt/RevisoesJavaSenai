package AtivElseFor;

import java.util.Scanner;

public class Ativ08_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numeroSecreto = 13;

        System.out.print("Jogo de Adivinhação!\n");
        System.out.print("\nInsira um número: ");
        int numero = sc.nextInt();

        if (numero == numeroSecreto){
            System.out.print("\nNúmero correto!");

        } else {
            System.out.println("\nNúmero incorreto!");
        }
    }
}
