import java.util.Scanner;

public class Ativ48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();

            if (num != 0) {
                System.out.println(num % 2 == 0 ? "Par\n" : "Ímpar\n");
            } else {
                System.out.println("Saindo...");
            }
        } while (num != 0);

        sc.close();
    }
}
