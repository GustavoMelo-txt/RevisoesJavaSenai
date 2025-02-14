package AtividadesTernaria;

import java.util.Scanner;

public class Ativ08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in the grade: ");
        double grade = sc.nextDouble();

        String result = (grade >= 7) ? "Approved." : "Failed.";
        System.out.println(result);
        sc.close();
    }
}
