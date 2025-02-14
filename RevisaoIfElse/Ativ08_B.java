package AtivElseFor;

import java.util.Scanner;

public class Ativ08_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o 1° número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Insira o 2° número: ");
        double numero2 = sc.nextDouble();

        if (numero1 > 2 * numero2) {
            System.out.print("\n" + numero1 + " é maior que o dobro de " + numero2);
        } else {
            System.out.print("\n" + numero1 + " não é maior que o dobro de " + numero2);
        }
    }
}
