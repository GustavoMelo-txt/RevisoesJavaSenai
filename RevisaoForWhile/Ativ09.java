import  java.util.Scanner;

public class Ativ09 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Insira um número: ");
	    int numero = sc.nextInt();
	    
	    for (int i = 1; i <= 10 ; i ++) {
	        int resultado = numero * i;
	        System.out.print(numero+ " x " +i+ " = " + resultado+ "\n");
	    }
	    sc.close();
	}
}