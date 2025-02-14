package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ06_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FEITO USANDO TERNARIA!

        System.out.print("Insira o valor do seu salario: ");
        double salario = sc.nextDouble();

        System.out.print("\nInsira o valor de cada parcela: ");
        double valorParcela = sc.nextDouble();

        System.out.println((valorParcela <= salario * 0.10) ? ("\nVocê pode comprar esse produto!") : ("\nVocê não pode comprar esse produto!"));

        sc.close();
    }
}
