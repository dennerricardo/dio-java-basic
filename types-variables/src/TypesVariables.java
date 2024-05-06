public class TypesVariables {
    public static void main(String[] args) throws Exception {

        byte age = 123;
        short year = 2024;
        int postalCode = 42304380; // if it starts with 0 you may need other type;
        long cpf = 23423423494L; // if it starts with 0 you may need other type ;
        float pi = 3.14F;
        double salary = 1234.44;
        String name = "Denner Ferreira";

        // TypesVariables.java

        short shortNumber = 1;
        int regularNumber = shortNumber;

        /*
         * Type mismatch: cannot convert from int to short
         * cast to solve that erro above
         * but it is not common to do
         */

        short shortNumber2 = (short) regularNumber;

        /*
         * this line is considered as variable declaration we start the existence
         * variable number with value 5 rule: type + name + value
         */
        int number = 5;

        /*
         * in the line below we will change the value of the variable to 10 note that
         * the type
         * is no longer necessary, as the variable has already been declared previously
         */
        number = 10;

        System.out.print(number);

        /*
         * by using the final reserved word, you determine that you will never
         * this variable may have another value;
         * soon line 25 will present a compilation error
         * this is considered a CONSTANT in the Java language
         */
        final double PI_VALUE = 3.14;

        // PI_VALUE=3.15; //This line will present a compilation error!

    }
}
