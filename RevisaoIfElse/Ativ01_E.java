package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[4];
        int maiorNumero = 0;

        for (int i = 1; i <= 3; i++){
            System.out.print("Insira o "+ i +"° número: ");
            numero[i] = sc.nextInt();
        }

        for (int i = 1; i < 4; i++){
            if (numero[i] > maiorNumero){
                maiorNumero = numero[i];
            }
        }

        System.out.println("\nO maior número foi: "+ maiorNumero);

        sc.close();
    }
}
