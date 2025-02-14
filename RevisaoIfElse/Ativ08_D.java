package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ08_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior1, maior2, maior3;

        // APENAS NUMEROS POSITIVOS

        System.out.print("Insira o valor do 1° numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Insira o valor do 2° numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Insira o valor do 3° numero: ");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            maior1 = numero1;
            numero1 = 0;
        } else if (numero2 > numero1 && numero2 > numero3){
            maior1 = numero2;
            numero2 = 0;
        } else {
            maior1 = numero3;
            numero3 = 0;
        }

        if (numero1 > numero2 && numero1 > numero3){
            maior2 = numero1;
            numero1 = 0;
        } else if (numero2 > numero1 && numero2 > numero3){
            maior2 = numero2;
            numero2 = 0;
        } else {
            maior2 = numero3;
            numero3 = 0;
        }

        if (numero1 > numero2 && numero1 > numero3){
            maior3 = numero1;
            numero1 = 0;
        } else if (numero2 > numero1 && numero2 > numero3){
            maior3 = numero2;
            numero2 = 0;
        } else {
            maior3 = numero3;
            numero3 = 0;
        }

        System.out.println("\nOrdem crescente: ");
        System.out.printf("%d > %d > %d", maior1, maior2, maior3);

        sc.close();
    }
}
