import java.sql.Date;

public class Operators {
    public static void main(String[] args) {

        String name = "DENNER";
        int age = 27;
        double weight = 69.5;
        char sex = 'M';
        boolean organDonor = false;
        //  *Date birthDate = new Date(); *

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String fullName = "Denner" + "Ricardo";

        System.out.println(fullName);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
    }
}
