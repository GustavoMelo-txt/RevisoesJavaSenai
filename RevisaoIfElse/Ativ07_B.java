package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ07_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero do mes: ");
        int mes = sc.nextInt();

        if (mes > 0 && mes <= 12) {
            System.out.println("\nMes valido.");
        } else {
            System.out.println("\nMes invalido.");
        }

        sc.close();
    }
}
