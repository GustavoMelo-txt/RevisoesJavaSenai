package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ02_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a 1° nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Insira a 2° nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.print("\nO aluno foi aprovado! \nMedia: " +media);
        } else if (media < 7 && media >= 5){
            System.out.print("\nO aluno está de recuperação!\nMedia: " +media);
        } else {
            System.out.print("\nO aluno foi reprovado! \nMedia: " +media);
        }
    }
}
