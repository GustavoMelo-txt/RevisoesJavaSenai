import java.util.Scanner;

public class Ativ35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o número para ver a tabuada: ");
		int numero = sc.nextInt();
		
		int i = 1;
		
		do {
		    System.out.print("\n" + numero + " x " + i + " = " + (numero * i));
		    i++;
		} while (i <= 10);
		
		sc.close();
	}
}
