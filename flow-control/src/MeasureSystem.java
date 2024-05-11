public class MeasureSystem {
    public static void main(String[] args) {
        String size = "s" ;
    
        switch (size) {
         case "S":{
             System.out.println("SMALL");
             break;
         }
         case "M":{
             System.out.println("MEDIUM");
             break;
         }
         case "L":{
             System.out.println("LARGE");
             break;
         }
         default:
         System.out.println("UNDEFINED");
             break;
        }
    }
 }
 