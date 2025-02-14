import java.util.Scanner;

public class Ativ19{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Insira um numero: ");
	    int numero = sc.nextInt();
	    
	    int fatorial = numero;
	    for (int i = numero - 1; i > 1; i--){
	        fatorial *= i;
	    }
	    
	    System.out.print(numero +"! = "+ fatorial);
	    
	    sc.close();
	}
}
