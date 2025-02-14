public class Ativ52 {
    public static void main(String[] args) {
        int numPrimos = 0, i = 2;

        do {
            if (numPrimo(i)) {
                System.out.print(i + "\n");
                numPrimos++;
            }
            i++;
        } while (numPrimos < 10);
    }

    public static boolean numPrimo(int num) {
        if (num < 2) return false;
        int i = 2;
        do {
            if (num % i == 0) return false;
            i++;
        } while (i <= Math.sqrt(num));
        return true;}
}

