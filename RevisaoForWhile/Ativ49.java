import java.util.Random;

public class Ativ49 {
    public static void main(String[] args) {

        Random random = new Random();
        
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String senha = "";
        int i = 0;

        do {
            int j = random.nextInt(characters.length());
            senha += characters.charAt(j);
            i++;
        } while (i < 6);

        System.out.println("Senha gerada: " + senha);
    }
}
