package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_G {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        if (numero % 5 == 0){
            System.out.print("\nO número é multiplo de 5");
        } else {
            System.out.print("\nO número não é multiplo de 5");
        }
    }
}
