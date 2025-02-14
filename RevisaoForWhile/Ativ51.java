public class Ativ51 {
    public static void main(String[] args) {
        int num = 1;
        int i = 0;

        do {
            int sum = 0;
            int divisivel = 1;

            do {
                if (num % divisivel == 0) {
                    sum += divisivel;
                }
                divisivel++;
            } while (divisivel < num);

            if (sum == num) {
                System.out.println(num);
                i++;
            }

            num++;
        } while (i < 10);
    }
}
