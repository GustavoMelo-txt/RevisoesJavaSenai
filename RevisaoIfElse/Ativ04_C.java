package AtivJava;

import java.util.Scanner;

public class Ativ04_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o 1° número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Insira o 2° número: ");
        double numero2 = sc.nextDouble();

        if (numero1 % numero2 == 0){
            System.out.print("\nO número é divisível pelo outro! \nDivisão: " +numero1+ " % " +numero2);
        } else {
            System.out.print("\nO número não é divisível pelo outro! \nDivisão: " +numero1+ " % " +numero2);
        }
    }
}
