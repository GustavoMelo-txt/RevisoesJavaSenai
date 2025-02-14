package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ05_A {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Insira uma idade: ");
     int idade = sc.nextInt();

     if (idade > 0 && idade < 12){
         System.out.println("\nEssa pessoa é uma criança.\nIdade: " + idade);
     } else if (idade >= 12 && idade < 18) {
         System.out.println("\nEssa pessoa é um adolescente.\nIdade: " + idade);
     } else if (idade >= 18 && idade < 60) {
         System.out.println("\nEssa pessoa é um adulto.\nIdade: " + idade);
     } else if (idade >= 60) {
         System.out.println("\nEssa pessoa é um idoso.\nIdade: " + idade);
     } else {
         System.out.println("\nIdade invalida.");
     }

     sc.close();
    }
}