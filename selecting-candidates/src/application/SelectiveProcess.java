package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelectiveProcess {
    public static void main(String[] args) throws Exception {
        System.out.println("Selective Process Case 1: ");
        cadidateAnalysis(1900.0);
        cadidateAnalysis(2900.0);
        cadidateAnalysis(3900.0);
        cadidateAnalysis(900.0);
        cadidateAnalysis(2000.0);
        
        System.out.println("Selective Process Case 2: ");
        selectingCanditates();
        
        System.out.println("Selective Process Case 3: ");
        printSelectedCandidates();
        
        System.out.println("Selective Process Case 4: ");
        String [] candidates = {"PAULO","DENNER","LUAN","GEORGIA","WEBER","KAMMILA","DENNER","JOÃO","LUCAS","EDER","ANTONIO","MARIA"};
        for (String cadidate : candidates) {
            callingCandidate(cadidate);
        }
    }

    static boolean answeredCall(){
        return new Random().nextInt(3)==1;
    }

    static void callingCandidate(String candidate){
        int attemptsDone = 1;
        boolean keepTrying = true;
        boolean answered = false;
        do{
            answered = answeredCall();
            keepTrying = !answered;
            if(keepTrying){
                attemptsDone++;
            }
        }while(keepTrying && attemptsDone < 3 );{
            if(answered){
                System.out.println("We got conect with "+ candidate +" on the "+attemptsDone+" attempt");
            }else{
                System.out.println("We couldn't get conect with "+ candidate +" we did "+attemptsDone+" attempts");
            }
        }
    }
    
    static void printSelectedCandidates(){
        String [] candidates = {"PAULO","DENNER","LUAN","GEORGIA","WEBER","KAMMILA","DENNER","JOÃO","LUCAS","EDER","ANTONIO","MARIA"};
        System.out.println("Print the List of Candidates showing the index of the element");
        for(int index=0; index < candidates.length; index++){
            System.out.println("Candidate number "+index+" is "+ candidates[index]);

        }

        for (String candidate : candidates) {
                System.out.println("FOR EACH: ");
                System.out.println(candidate+" has been selected !!!");
        }
    }
    static void selectingCanditates(){
        String [] candidates = {"PAULO","DENNER","LUAN","GEORGIA","WEBER","KAMMILA","DENNER","JOÃO","LUCAS","EDER","ANTONIO","MARIA"};
        int selectedCandidate = 0; 
        int currentCadidate = 0 ;
        double baseSalary = 2000.0;
        while (selectedCandidate < 5 && currentCadidate < candidates.length) {
            String candidate = candidates[currentCadidate];
            double intendedSalary = intendedValue();
            System.out.println("Candidate "+ candidate +" asked for this amount: $"+intendedSalary);
            if(baseSalary>= intendedSalary){
                System.out.println("Candidate "+candidate+" has been selected");
                selectedCandidate++;
            }
            currentCadidate++;
        }
    }
    

    static double intendedValue(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);

    }

    static void cadidateAnalysis(double intendedSalary){
        double baseSalary = 2000.0;
        if(baseSalary > intendedSalary){
            System.out.println("Call the candidate !!");
        }else if(baseSalary == intendedSalary){
            System.out.println("Call the candidate to deal !!");
        }else{
            System.out.println("Waiting for other candidates !!");

        }
    }
}
