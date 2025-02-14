package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ07_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as horas atuais abaixo.");
        System.out.print("Horas: ");
        int horas = sc.nextInt();
        System.out.print("Minutos: ");
        int minutos = sc.nextInt();

        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60){
            System.out.printf("\nHorario atual: %d:%d", horas, minutos);
        } else {
            System.out.println("\nHorário invalido.");
        }

    }
}
