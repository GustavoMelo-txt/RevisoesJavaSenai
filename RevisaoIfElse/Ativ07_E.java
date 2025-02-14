public class Ativ07_E {

    public static void main(String[] args) {
      
        int dataInicial = 20230101;
        int dataFinal = 20231231;
        int dataAlvo = 20230615;

        if (dataAlvo >= dataInicial && dataAlvo <= dataFinal) {
            System.out.println("A data está dentro do período.");
        } else {
            System.out.println("A data está fora do período.");
        }
    }
}
