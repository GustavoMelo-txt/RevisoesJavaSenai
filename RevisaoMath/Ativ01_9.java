package AtivMatematica;

import java.util.Scanner;

public class Ativ01_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double numero = 10;
        double raizQuadrada = Math.sqrt(10);

        System.out.printf("A raiz quadrada de %.2f é: %.1f", numero, raizQuadrada);
    }
}
