package AtivJava;

import java.util.Scanner;

public class Ativ06_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 500;

        System.out.print("Saldo: " +saldo+ "R$");
        System.out.print("\nInsira a quantidade para o saque: ");
        double saque = sc.nextDouble();

        if(saque <= saldo){
            System.out.print("Saque concluído! \nSaque: " +saque+ "R$\nSaldo: " +(saldo - saque)+ "R$");
        } else {
            System.out.print("Saldo insuficiente! \nSaque: " +saque+ "R$\nSaldo: " +saldo+ "R$");
        }
    }
}
