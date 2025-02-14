package RevisaoIfElse;

import java.util.Scanner;

public class Ativ09_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("\nDigite 1 para ver em Fahrenheit \nDigite 2 para ver em Kelvin");
        int escolha = sc.nextInt();

        if (escolha == 1){
            double Fahrenheit = (celsius * 1.8) + 32;
            System.out.println("\nFahrenheit: " + Fahrenheit);
        }else if(escolha == 2){
            double Kelvin = celsius + 273.15;
            System.out.println("\nKelvin: " + Kelvin);
        }else{
            System.out.println("\nOpcao invalida");
        }

        sc.close();
    }
}
