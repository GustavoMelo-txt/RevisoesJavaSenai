package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira quantos dias tem o ano: ");
        int ano = sc.nextInt();

        if (ano == 366){
            System.out.print("\nO ano é bissexto.");
        } else if (ano == 365){
            System.out.println("\nO ano não é bissexto.");
        }else{
            System.out.println("\nInválido.");
        }
    }
}
