import java.util.Scanner;

public class Ativ20{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Numeros de 1 a 50 pulando de 5 em 5:");
	    System.out.print("\n1");
	    for (int i = 5; i <= 50; i += 5){
	        System.out.print("\n" + i);
	    }
	    
	    sc.close();
	}
}