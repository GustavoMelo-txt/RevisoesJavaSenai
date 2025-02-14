package AtividadesTernaria;

import java.util.Scanner;

public class Ativ13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in two number: ");
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        
        int highest = (number > number2) ? number : number2;
        System.out.println(highest + " is the highest.");
        
        sc.close();
    }
}
