package AtivJava;

import java.util.Scanner;

public class Ativ07_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira as horas atuais: ");
        double horario = sc.nextDouble();

        if (horario >= 0 && horario <= 12){
            System.out.print("O horário está no período da manhã! \nHorário: " +horario);

        } else if (horario >= 13 && horario <= 17){
            System.out.print("O horário está no período da tarde! \nHorário: " +horario);

        }else {
            System.out.print("O horário está no período da noite! \nHorário: " +horario);
        }
    }
}
