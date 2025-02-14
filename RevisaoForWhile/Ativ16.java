import java.util.Scanner;

public class Ativ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira uma palavra: ");
        String palavra = sc.nextLine();
        
        int tamanhoPalavra = palavra.length();
        
        System.out.println("\nLetras da palavra: ");
        
        for (int i = 0; i < tamanhoPalavra; i++){
            System.out.println(palavra.charAt(i));
        }
        
        sc.close();
    }
}