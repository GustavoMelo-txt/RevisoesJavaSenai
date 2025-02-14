package AtivMatematica;

import java.util.Scanner;

public class Ativ02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double base = 8;
        double expoente = 3;
        double resultado = Math.pow(base, expoente);

        System.out.print("O número " +base+ " elevado á " +expoente+ " é: " +resultado);
    }
}
