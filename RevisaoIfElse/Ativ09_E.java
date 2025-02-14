package RevisaoIfElse;

import java.util.Scanner;

public class Ativ09_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioAutorizado = "Gustavo";
        String senhaAutorizada = "1234";

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (senha.equals(senhaAutorizada) && usuario.equals(usuarioAutorizado)){
            System.out.println("\nUsuário autorizado");
        }else{
            System.out.println("\nUsuario nao autorizado");
        }

        sc.close();
    }
}
