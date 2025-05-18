//Program to check even odd number 
import java.util.*;
public class OddEven{
    public static void main(String [] arg){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("\nThe input number " +num +" is a Even Number");

        }
        else{
            System.out.println("THe number "+num +" is a odd number");
        }
        scanner.close();


    }
    
}


//Done

// Enter a number:32

// The input number 32 is a Even Number