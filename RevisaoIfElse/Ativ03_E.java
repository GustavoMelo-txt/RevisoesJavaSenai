package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ03_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a 1° palavra: ");
        String palavra1 = sc.nextLine();

        System.out.print("Insira a 2° palavra: ");
        String palavra2 = sc.nextLine();

        String backup1 = palavra1.toUpperCase();
        String backup2 = palavra2.toUpperCase();

        if (backup1.equals(backup2)) {
            System.out.println("\nAs palavras são iguais.\nPrimeira palavra: " + palavra1 + "\nSegunda palavra: " + palavra2);
        } else {
            System.out.println("\nAs palavras não são iguais.\nPrimeira palavra: " + palavra1 + "\nSegunda palavra: " + palavra2);
        }

        sc.close();
    }
}
