package AtivJava;

import java.util.Scanner;

public class Ativ05_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a temperatura atual: ");
        double temperatura = sc.nextDouble();

        if(temperatura >= 21 && temperatura <= 26){
            System.out.print("\nA temperatura está normal! \nTemperatura atual: " +temperatura+ "°");

        } else if (temperatura <= 20){
            System.out.print("\nA temperatura está baixa! \nTemperatura atual: " +temperatura+ "°");

        }else {
            System.out.print("\nA temperatura está alta! \nTemperatura atual: " +temperatura+ "°");
        }
    }
}
