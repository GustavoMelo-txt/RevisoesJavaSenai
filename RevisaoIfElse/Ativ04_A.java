package AtivJava;

import java.util.Scanner;

public class Ativ04_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o 1° número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Insira o 2° número: ");
        double numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        if (soma >= 100){
            System.out.print("\nA soma é maior que 100. \nSoma: " +numero1+ " + " +numero2+ " = " +soma);
        } else {
            System.out.print("\nA soma é menor que 100. \nSoma: " +numero1+ " + " +numero2+ " = " +soma);
        }
    }
}
