public class ExampleBreakContinue {
    public static void main(String[] args) {
        for( int number = 1; number <= 5; number ++){
            if (number == 3) {
                break;
            }
            System.out.println(number);
        }
        
        System.out.println("======");

        for( int number = 1; number <= 5; number ++){
            if (number == 3) {
                continue;
            }
            System.out.println(number);
        }
    }

    
}