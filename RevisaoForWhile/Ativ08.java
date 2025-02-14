import  java.util.Scanner;

public class Ativ08 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int numero = 7;
	    
	    for (int i = 1; i <= 10 ; i ++) {
	        int resultado = numero * i;
	        System.out.print(numero+ " x " +i+ " = " + resultado+"\n");
	    }
	    sc.close();
	}
}