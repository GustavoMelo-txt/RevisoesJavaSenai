package AtivJava;

import java.util.Scanner;

public class Ativ06_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu salario: ");
        double salario = sc.nextDouble();

        if (salario >= 3000){
            System.out.print("Você pode financiar um imóvel! \nImóvel: 3000R$ ");
        } else {
            System.out.print("Você não pode financiar um imóvel. \nImóvel: 3000R$");
        }
    }
}
