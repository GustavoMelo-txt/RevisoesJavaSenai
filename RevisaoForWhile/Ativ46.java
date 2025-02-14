import java.util.Scanner;

public class Ativ46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        System.out.print("Insira um número: ");
        int num = sc.nextInt();

        do {
            System.out.print(num * i + " ");
            i++;
        } while (i <= 10);

        sc.close();
    }
}
