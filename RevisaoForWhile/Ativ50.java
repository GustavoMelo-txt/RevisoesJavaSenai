import java.util.Scanner;

public class Ativ50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha;
        int SenhaCorreta = 1234;

        do {
            System.out.print("Insira a senha: ");
            senha = sc.nextInt();

            if (senha == SenhaCorreta){
                System.out.println("Senha correta!\n");
            } else {
                System.out.println("Senha incorreta!\n");
            }
        } while (senha != SenhaCorreta);

        sc.close();
    }
}
