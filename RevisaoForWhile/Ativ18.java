import java.util.Scanner;

public class Ativ18{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Insira uma palavra: ");
	    String palavra = sc.nextLine();
	    
	    int tamanhoPalavra = palavra.length();
	    
	    String contrarioPalavra = "";
	    for (int i = tamanhoPalavra - 1; i >= 0; i--){
	          contrarioPalavra += palavra.charAt(i);
	    }
	    
	    if (palavra.equals(contrarioPalavra)){
	        System.out.print("\nEssa palavra é um palindromo.");
	    } else {
	        System.out.print("\nEssa palavra não é um palindromo.");
	    }
	    
	    sc.close();
	}
}