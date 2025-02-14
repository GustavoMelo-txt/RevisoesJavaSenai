package RevisaoIfElse;

import java.util.Scanner;

public class Ativ09_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Insira seu peso: ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50){
            System.out.println("\nEssa pessoa pode doar sangue");
        }else{
            System.out.println("\nEssa pessoa nao pode doar sangue");
        }

        sc.close();
    }
}
