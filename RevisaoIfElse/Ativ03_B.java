package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ03_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a senha: ");
        int senha = sc.nextInt();

        if (senha == 1234) {
            System.out.println("\nSenha correta!");
        } else {
            System.out.println("\nSenha incorreta...");
        }

        sc.close();
    }
}
