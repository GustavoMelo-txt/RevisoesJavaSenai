import  java.util.Scanner;

public class Ativ06 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int soma = 0;
	    
	    for (int i = 0; i <= 100 ; i += 2) {
	        soma += i;
	    }
	    
	    System.out.print("A soma dos números é: " +soma);
	    sc.close();
	}
}