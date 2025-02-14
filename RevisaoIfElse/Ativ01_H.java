package GustavoMatheusTarde;

import java.util.Scanner;

public class Ativ01_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira uma letra: ");
        char letra = sc.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.print("\nA letra é uma vogal");
        }else {
            System.out.print("\nA letra não é vogal");
        }
    }
}
