import java.util.Scanner;

public class Ativ17{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Insira uma palavra: ");
	    String palavra = sc.nextLine();
	    
	    int tamanhoPalavra = palavra.length();
	    
	    for (int i = tamanhoPalavra - 1; i >= 0; i--){
	        System.out.print("\n" + palavra.charAt(i));
	    }
	    
	    sc.close();
	}
}
