import java.util.Scanner;

public class Ativ47 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num = sc.nextInt();

        int divisores = 0;
        int i = 1;

        do {
            if (num % i == 0){
                divisores++;
            }
            i++;
        } while (i <= num);
        if (divisores > 2){

            System.out.printf("\nO numero %d nao é numero primo.", num);
        } else {

            System.out.printf("\nO numero %d é numero primo.", num);
        }
        
        sc.close();
    }
}
