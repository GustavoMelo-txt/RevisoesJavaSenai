package AtivJava;

import java.util.Scanner;

public class Ativ05_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua pressão arterial: ");
        double pressaoArt = sc.nextDouble();

        if(pressaoArt <= 13 && pressaoArt >= 10){
            System.out.print("\nSua pressão arterial está normal! \nPressão arterial: " +pressaoArt);

        } else if (pressaoArt >= 14 ){
            System.out.print("\nSua pressão arterial está alta! \nPressão arterial: " +pressaoArt);

        } else {
            System.out.print("\nSua pressão arterial está baixa! \nPressão arterial: " +pressaoArt);
        }
    }
}
