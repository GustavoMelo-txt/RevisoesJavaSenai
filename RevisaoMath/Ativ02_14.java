package AtivMatematica;

import java.util.Scanner;

public class Ativ02_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double base = 9;
        double expoente = 0.5;
        double resultado = Math.pow(base, expoente);

        System.out.print("O número " +base+ " elevado á " +expoente+ " é: " +resultado);
    }
}
