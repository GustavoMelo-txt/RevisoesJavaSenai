package AtividadesTernaria;

import java.util.Scanner;

public class Ativ20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type in the grade: ");
        double grade = sc.nextDouble();

        String result = (grade >= 5 && grade <= 6.9) ? "Remediation classes." : (grade >= 7)? "Approved." : "Failed.";
        System.out.println(result);
        sc.close();
    }
}
