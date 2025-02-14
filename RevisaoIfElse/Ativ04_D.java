package GustavoMatheusJava;

import java.util.Scanner;

public class Ativ04_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada dos valores de cada lado do triangulo
        System.out.print("Insira o primeiro numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Insira o segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Insira o terceiro numero: ");
        int numero3 = sc.nextInt();

        //Comparação entre os lados pra identificar se é um triangulo e qual é o seu tipo
        if (numero1 < numero2 + numero3 && numero2 < numero1 + numero3 && numero3 < numero1 + numero2){
            if (numero1 == numero2 && numero1 == numero3) {
                System.out.println("\nEsses 3 números formam um triangulo equilátero.");
            } else if (numero1 == numero2 || numero1 == numero3){
                System.out.println("\nEsses 3 números formam um triangulo isosceles.");
            } else {
                System.out.println("\nEsses 3 números formam um triangulo escaleno.");
            }
        } else {
            System.out.println("\nEsses números não formam um triângulo...");
        }
    sc.close();
    }
}
