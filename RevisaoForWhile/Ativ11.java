import  java.util.Scanner;

public class Ativ11 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    for (int i = 1; i <= 10 ; i ++) {
	       int resultado = i * i;
	       System.out.print("Resultado de " +i+ " é: "  +resultado+ "\n");
	    }
	    sc.close();
	}
}