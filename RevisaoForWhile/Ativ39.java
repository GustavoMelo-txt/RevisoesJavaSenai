import java.util.Scanner;

public class Ativ39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		do {
		    System.out.print("\nInsira um número: ");
		    numero = sc.nextInt();
		    
		    if (numero >= 0) {
		        System.out.print("Número Positivo: " +numero);
		    }
		} while (numero >= 0);
		
		System.out.print("Você digitou um número negativo.");
		
		sc.close();
	}
}
