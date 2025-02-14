package GustavoJavaDoWhile;

import java.util.Scanner;

public class Ativ44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.print("Insira um numero: ");
        int numero = sc.nextInt();

        System.out.println("Divisores do número: " + numero);
        do {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);

        sc.close();
    }
}
