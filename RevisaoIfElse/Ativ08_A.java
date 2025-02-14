package AtivElseFor;

import java.util.Scanner;

public class Ativ08_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o 1° número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Insira o 2° número: ");
        double numero2 = sc.nextDouble();

        if (numero1 >= 0 && numero2 >= 0){
            System.out.print("\nAmbos os números são positivos");
        } else if ( numero1 < 0 && numero2 < 0){
            System.out.print("\nAmbos os números são negativos.");
        }else {
            System.out.println("\nOs números tem sinais diferentes.");
        }

    }
}
