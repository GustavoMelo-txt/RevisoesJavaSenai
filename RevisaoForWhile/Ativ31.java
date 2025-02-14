import java.util.Scanner;

public class Ativ31{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		do {
		    System.out.print("Insira um número: ");
		    numero = sc.nextInt();
		    
		} while (numero >= 0);
		
		System.out.print("Você digitou um número negativo!");
	
	    sc.close();
	} 
}
