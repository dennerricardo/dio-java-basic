import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Type first parameter: ");
        int parameterOne = terminal.nextInt();
        System.out.println("Type second parameter: ");
        int parameterTwo = terminal.nextInt();

        try{
            counting(parameterOne,parameterTwo);
        }catch(InvalidParameterException e){
            e.printStackTrace();
            System.out.println("Second Parameter needs to be bigger then first one");
            
        }
        
    }
    static void counting(int parameterOne, int parameterTwo) throws InvalidParameterException{
        if(parameterOne > parameterTwo){
            throw new InvalidParameterException();
        }else{
            for(int i = parameterOne ; i <= parameterTwo; i++ ){
                System.out.println("Printing: "+i);
                }
            }   
        }
}