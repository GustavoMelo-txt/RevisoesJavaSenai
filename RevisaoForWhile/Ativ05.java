import  java.util.Scanner;

public class Ativ05 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int soma = 0;
	    
	    for (int i = 1; i <= 100 ; i++) {
	        soma += i;
	    }
	    
	    System.out.print("A soma dos números é: " +soma);
	    sc.close();
	}
}