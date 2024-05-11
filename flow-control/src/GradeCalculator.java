public class GradeCalculator {
    public static void main(String[] args) {
        int points = 4;

        if (points >= 7){
             System.out.println("Approved");
        } 
        else if (points >= 5 && points < 7) { //true or false
            System.out.println("Extra Exam"); 
        } 
        else{
            System.out.println("Reproved"); 
        }


        int points2 = 7;
		String result2 = points2 >=7 ? "Approved" : "Reproved";
		System.out.println(result2);



        int points3 = 5;
		String result3 = points3 >=7 ? "Approved" : points3 >=5 && points3 <7 ? "Extra Exam" : "Reproved";
		System.out.println(result3);
	
    }
}
