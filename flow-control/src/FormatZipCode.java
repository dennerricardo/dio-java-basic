public class FormatZipCode {
    public static void main(String[] args) {
       try{
           String formattedZipCode = formatZipCode("1234567");
           System.out.println(formattedZipCode);
        }catch(InvalidZipCodeException e){
            e.printStackTrace();
            System.out.println("Zip Code is Invalid");
       }
    }
    static String formatZipCode (String zipCode) throws InvalidZipCodeException{
        if (zipCode.length() != 8) {
            throw new InvalidZipCodeException();
        }
        return "12.234-065";
    }
}
