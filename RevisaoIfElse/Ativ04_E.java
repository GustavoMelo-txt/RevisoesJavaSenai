package GustavoMatheusJava;

import java.util.Locale;
import java.util.Scanner;

public class Ativ04_E {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int numero = sc.nextInt();

        double raiz = Math.sqrt(numero);

        double numeroDecimal = raiz - (int)raiz;

        if (numeroDecimal == 0){
            System.out.println("\nSeu numero é um quadrado perfeito!\nNumero: " + numero + "\nRaiz: " + (int)raiz);
        } else {
            System.out.printf("\nSeu numero não é um quadrado perfeito!\nNumero: %d\nRaiz: %.2f", numero, raiz);
        }

    sc.close();
    }
}
