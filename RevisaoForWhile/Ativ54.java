import java.util.Scanner;

public class Ativ54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Insira um numero: ");
            num = sc.nextInt();

            System.out.println(Math.sqrt(num) + "\n");
        } while (num >= 0);
        System.out.println("Saindo...");

        sc.close();
    }
}
