package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ02_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a 1° nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Insira a 2° nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Insira a 3° nota: ");
        double nota3 = sc.nextDouble();

        if (nota1 > nota2 && nota1 > nota3){
            System.out.print("\nA primeira nota é a maior nota.\nNota: " + nota1);
        } else if (nota2 > nota3){
            System.out.print("\nA segunda nota é a maior nota. \nNota: " + nota2);
        } else {
            System.out.print("\nA terceira nota é a maior nota. \nNota: " + nota3);
        }

        if (nota1 < nota2 && nota1 < nota3){
            System.out.print("\n\nA primeira nota é a menor nota.\nNota: " + nota1);
        } else if (nota2 < nota3){
            System.out.print("\n\nA segunda nota é a menor nota. \nNota: " + nota2);
        } else {
            System.out.print("\n\nA terceira nota é a menor nota. \nNota: " + nota3);
        }

        sc.close();
    }
}
