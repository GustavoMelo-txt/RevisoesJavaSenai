import  java.util.Scanner;

public class Ativ13 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numero1 = 0, numero2 = 1;
	    int proximoTermo;
	    
	    System.out.print("Sequência de Fibonacci:");
	    
	    for (int i = 2; i <= 10 ; i ++) {
	        System.out.print(numero1 + "\n");
	        proximoTermo = numero1 + numero2;
	        numero1 = numero2;
	        numero2 = proximoTermo;
	    }
	    sc.close();
	}
}