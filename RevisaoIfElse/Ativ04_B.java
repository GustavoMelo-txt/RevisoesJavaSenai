package AtivJava;

import java.util.Scanner;

public class Ativ04_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o 1° número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Insira o 2° número: ");
        double numero2 = sc.nextDouble();

        double diferenca = numero1 - numero2;

        if (diferenca < 0){
            System.out.print("\nA diferença é negativa!");
        } else {
            System.out.print("\nA diferença não é negativa!");
        }
    }
}
