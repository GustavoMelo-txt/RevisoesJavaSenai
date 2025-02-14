import java.util.Scanner;

public class Ativ32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int total = 0;

        do {
            System.out.print("Digite um número (ou 0 para sair): ");
            
            numero = sc.nextInt();
            total += numero;
            
        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + total);
    }
}
