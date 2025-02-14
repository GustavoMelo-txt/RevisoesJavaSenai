package AtividadesTernaria;

import java.util.Scanner;

public class Ativ06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in your age: ");
        int age = sc.nextInt();
        System.out.print("Do you have a driver license? ");
        char driverLicense = sc.next().toUpperCase().charAt(0);
        
        String result = (age >= 18 && driverLicense == 'Y') ? "You can drive." : "You can't drive.";
        System.out.println(result);
        
        sc.close();
    }
}
