package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ01_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <=  50) {
            System.out.print("\nO número está no intervalo de 10 a 50.");
        } else {
            System.out.print("\nO número não está no intervalo de 10 a 50.");
        }
    }
}
