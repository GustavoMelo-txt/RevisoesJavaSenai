package AtividadesTernaria;

import java.util.Scanner;

public class Ativ11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in a letter: ");
        char letter = sc.next().toLowerCase().charAt(0);

        String result = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') ? "Vowel." : "Consonant.";
        System.out.println(result);
        sc.close();
    }
}
