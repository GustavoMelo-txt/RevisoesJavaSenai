package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ01_J {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.print("\nO número está no intervalo de 100 a 200.");
        } else {
            System.out.print("\nO número está fora do intervalo.");
        }
    }
}
