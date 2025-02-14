package AtivJava;

import java.util.Scanner;

public class Ativ06_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        double compra = sc.nextDouble();

        double desconto = compra * 0.10;
        double valorFinal = compra - desconto;

        if (compra > desconto){
            System.out.println("Valor da compra: " +compra+ "\nDesconto da compra: " +desconto);
        }
    }
}
