package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ03_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva \"Sim\" ou \"Nao\": ");
        String palavra = sc.nextLine();

        if (palavra.equals("Sim") || palavra.equals("sim")){
            System.out.println("\nO usuário escreveu \"Sim\"!");
        } else if (palavra.equals("Nao") || palavra.equals("nao")){
            System.out.println("\nO usuário escreveu \"Nao\"!");
        } else {
            System.out.println("\nResposta Inválida...");
        }

    sc.close();
    }
}
