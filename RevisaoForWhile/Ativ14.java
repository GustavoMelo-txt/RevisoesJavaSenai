import  java.util.Scanner;

public class Ativ14 {
    public static void main(String[] args) {

        for (int num = 2; num <= 50; num++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + "\n");
            }
        }
    }
}
