import java.util.Scanner;

public class Ativ36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		 int soma = 0;
		 int i = 1;
		 
		 do {
		     soma += i;
		     i++;
		     
		 } while (i <= 50);
		 
		 System.out.print("A soma dos números de 1 a 50 é: " +soma);
	}
}
