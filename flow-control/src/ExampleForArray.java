public class ExampleForArray {
    public static void main(String[] args) {
        String students [] = {"DENNER", "LUAN","WEBER", "ROBSON","ARTHUR","LUCAS"};

        for(int x =0; x < students.length; x++){
            System.out.println("The student on index x=" + x + " is " + students[x]);
        }

        for (String student : students) {
            System.out.println("Student's name: " + student);
        }
    }
}
