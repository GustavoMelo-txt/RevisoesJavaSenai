package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ03_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = sc.nextLine();

        int quantidadeLetras = palavra.length();

        if (quantidadeLetras > 5){
            System.out.println("\nEssa palavra tem mais de 5 letras!\nPalavra: " + palavra);
        } else {
            System.out.println("\nEssa palavra não tem mais de 5 letras!\nPalavra: " + palavra);
        }

        sc.close();
    }
}
