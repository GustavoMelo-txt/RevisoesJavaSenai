package AtividadesTernaria;

import java.util.Scanner;

public class Ativ30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type in the grades: ");
        double grade1 = sc.nextDouble();
        double grade2 = sc.nextDouble();

        double avg = (grade1 + grade2) / 2;
    
        String result = (avg >= 6) ? "Approved." : "Failed.";
        System.out.println(result);
        sc.close();
    }
}  
