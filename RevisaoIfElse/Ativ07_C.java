package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ07_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um dia do mes de janeiro: ");
        int dia = sc.nextInt();

        if (dia > 0 && dia <= 31) {
            System.out.println("\nDia valido.\nDia: " + dia);
        } else {
            System.out.println("\nDia invalido.");
        }

        }
    }