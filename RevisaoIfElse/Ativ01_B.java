package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("\nSeu número é par.");
        } else {
            System.out.println("\nSeu número é ímpar");
        }
        
        sc.close();
    }
}
