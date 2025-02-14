package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ06_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor da sua compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 50.0){
            System.out.println("\nVocê pode resgatar o seu brinde!");
        } else {
            System.out.println("\nO minimo pra resgatar o brinde é 50 reais...");
        }

        sc.close();
    }
}