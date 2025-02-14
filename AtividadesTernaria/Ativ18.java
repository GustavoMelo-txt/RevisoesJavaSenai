package AtividadesTernaria;

import java.util.Scanner;

public class Ativ18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in the measures for each side of the triangle (A, B, C): ");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();
        
        String result = (sideA == sideB && sideA == sideC) ? "Equliateral triangle." : (sideA == sideB || sideA == sideC || sideB == sideC) ? "Isosceles triangle." : "Scalene triangle.";
        System.out.println(result);

        sc.close();
    }
}
