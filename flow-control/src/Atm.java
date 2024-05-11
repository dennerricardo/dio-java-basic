public class Atm {
    public static void main(String[] args) {
        double balance = 25.0 ;
        double toReceive = 5.0;

        if(toReceive < balance ){
            balance = balance - toReceive ;
            System.out.println("New balance: $" + balance);
        }
        else {
            System.out.println("insufficient balance");
        }
    }
    
}