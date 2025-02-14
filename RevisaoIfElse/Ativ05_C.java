package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ05_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um tamanho: ");
        double tamanho = sc.nextDouble();

        if (tamanho < 1.60){
            System.out.println("\nEssa pessoa é considerada de baixa estatura.");
        } else if (tamanho >= 1.60 && tamanho <= 1.75) {
            System.out.println("\nEssa pessoa é considerada de media estatura.");
        } else {
            System.out.println("\nEssa pessoa é considerada de alta estatura.");
        }
    }
}
