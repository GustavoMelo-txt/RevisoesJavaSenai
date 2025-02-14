package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ03_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um nome: ");
        String nome = sc.nextLine();

        char primeiraLetra = nome.charAt(0);

        if (primeiraLetra == 'A' || primeiraLetra == 'a'){
            System.out.println("\nEsse nome começa com a letra A!\nNome: " + nome);
        } else {
            System.out.println("\nEsse nome não começa com a letra A!\nNome: " + nome);
        }

        sc.close();
    }
}
