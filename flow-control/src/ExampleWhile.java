import java.util.concurrent.ThreadLocalRandom;
public class ExampleWhile {
    public static void main(String[] args) {
        double monthBalance = 50.0;
            while (monthBalance > 0) {
                double candyPrice = randomValue();
                if (candyPrice > monthBalance) {
                    candyPrice = monthBalance;
                }
                System.out.println("Candy price: "+ candyPrice + " added to the shopping cart");
                monthBalance = monthBalance - candyPrice;
            }
        System.out.println("Month Balance: " + monthBalance);
        System.out.println("Denner spent all of his money on candies.");
    }

    private static double randomValue(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
