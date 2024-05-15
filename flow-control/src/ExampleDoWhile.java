import java.util.Random;
public class ExampleDoWhile {
    public static void main(String[] args) {
        System.out.println("Calling...");
        do{
            System.out.println("Ringing");
        }while(ringing());

        System.out.println("Hello !!");
        
    }
    private static boolean ringing(){
        boolean answered = new Random().nextInt(3)==1;
        System.out.println("Answered the phone ? "+ answered);
        return ! answered;

    }
}
