package AtivMatematica;

import java.util.Scanner;

public class Ativ02_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double base = 0.1;
        double expoente = 2;
        double resultado = Math.pow(base, expoente);

        System.out.print("O número " +base+ " elevado á " +expoente+ " é: " +resultado);
    }
}
