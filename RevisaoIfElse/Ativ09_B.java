package RevisaoIfElse;

import java.util.Scanner;

public class Ativ09_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoCerto = 1234;

        System.out.println("Digite o codigo de acesso: ");
        int codigo = sc.nextInt();

        if (codigo == codigoCerto){
            System.out.println("\nCodigo certo!");
        }else{
            System.out.println("\nO codigo nao esta certo...");
        }

        sc.close();
    }
}
