
//Check Voting Eligibility

import java.util.Scanner;
public class  CheckVotingEligibility{
    public static void main (String [] arg){
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.print("Enter Age: ");
        age=sc.nextInt();

        //Check the age is greater than 18 or not 
        if(age>=18){
            System.out.println("\nYes, the person is eligible");
        }

        else{
            System.out.println("\nNo, the person is mot eligible");
        }
    }
}
//Done
