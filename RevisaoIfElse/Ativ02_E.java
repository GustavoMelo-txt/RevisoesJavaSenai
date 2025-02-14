package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ02_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Disciplina de Matemática");

        System.out.print("Insira a 1° nota: ");
        double notaMatematica1 = sc.nextDouble();

        System.out.print("Insira a 2° nota: ");
        double notaMatematica2 = sc.nextDouble();

        double mediaMatematica = (notaMatematica1 + notaMatematica2) / 2;

        System.out.println("\nDisciplina de Portugues");

        System.out.print("Insira a 1° nota: ");
        double notaPortugues1 = sc.nextDouble();

        System.out.print("Insira a 2° nota: ");
        double notaPortugues2 = sc.nextDouble();

        double mediaPortugues = (notaPortugues1 + notaPortugues2) / 2;

        if (mediaMatematica >= 7){
            System.out.print("\nO aluno passou na disciplina de Matematica! \nMedia: " + mediaMatematica);
        } else {
            System.out.print("\nO aluno não passou na disciplina de Matematica. \nMedia: " + mediaMatematica);
        }

        if (mediaPortugues >= 7){
            System.out.print("\nO aluno passou na disciplina de Portugues! \nMedia: " + mediaPortugues);
        } else {
            System.out.print("\nO aluno não passou na disciplina de Portugues. \nMedia: " + mediaPortugues);
        }
        sc.close();
    }
}
