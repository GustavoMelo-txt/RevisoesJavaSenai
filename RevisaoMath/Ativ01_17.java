package GustavoMathJava;

import java.util.Scanner;

public class Ativ01_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raiz = Math.sqrt(0.001);

        System.out.printf("A raiz quadrada de 0.001 é: %.3f", raiz);

        sc.close();
    }
}
