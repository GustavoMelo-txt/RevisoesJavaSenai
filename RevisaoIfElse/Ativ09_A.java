package RevisaoIfElse;

import java.util.Scanner;

public class Ativ09_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da placa: ");
        String placa = sc.nextLine();

        int ultimoDigito = placa.charAt(placa.length()-1) - '0';

        if (ultimoDigito % 2 == 0){
            System.out.println("\nA placa com final par pode passar");
        }else if (ultimoDigito % 2 != 0){
            System.out.println("\nA placa com final impar pode passar");
        }else{
            System.out.println("\nNao pode passar!");
        }

        sc.close();
    }
}
