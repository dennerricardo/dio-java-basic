import java.sql.Date;

public class Operators {
    public static void main(String[] args) {

        String name = "DENNER";
        int age = 27;
        double weight = 69.5;
        char sex = 'M';
        boolean organDonor = false;
        // *Date birthDate = new Date(); *

        double sum = 10.5 + 15.7;
        int subtraction = 113 - 25;
        int multiplication = 20 * 7;
        int division = 15 / 3;
        int modulus = 18 % 3;
        double result = (10 * 7) + (20 / 4);

        String fullName = "Denner" + "Ricardo";

        System.out.println(fullName);

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

        int number = -5;
        number = number * -1;
        System.out.println(number);
        // print negative number
        System.out.println(-number);

        // incrementing 1 to number, printing 6
        number++;
        System.out.println(number);

        // incrementing 1 to number, printing 7
        System.out.println(number++);// ops something is wrong
        System.out.println(number);// now yes, became 7

        System.out.println(++number);

        boolean positive = true;

        System.out.println("Flip " + !positive);

        int a, b;

        a = 6;
        b = 7;

        String isItEqual = (a == b) ? "true" : "false";

        System.out.println(isItEqual);

        if (a > b) {
            System.out.print("a is bigger than b");
        }
        if (a < b) {
            System.out.print("a is smaller than b");
        }
        if (a >= b) {
            System.out.print("a is bigger or equals to b");
        }
        if (a <= b) {
            System.out.print("a is smaller or equals to b");
        }
        if (a != b) {
            System.out.print("a is different from b");
        }

        boolean condition1 = true;
        boolean condition2 = true;

        if (condition1 && condition2){
            System.out.print("both conditions are true");
        }   

        if (condition1 || condition2){
            System.out.print( "one of them doesn't need to be true");
        }

    }
}
