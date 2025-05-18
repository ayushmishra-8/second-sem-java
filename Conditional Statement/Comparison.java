//Program to check the input number is grater than 10 or not

import java.util.*;
public class Comparison {
    public static void main(String[] args){
        int n;
        System.out.println("Check the enter number is greater than 10 or not:->");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        n=sc.nextInt();

        //Check the enter number is greater than 10 or not
        if(n==10)
        System.out.println("Both are same");
        else if(n>10){
            System.out.println("Entered number is greater than 10");
        }
        else if(n<10){
            System.out.println("The entered number is less than 10");
        }
        else{
            System.out.println("Wrong input");
        }
        sc.close();
    }
   
    
}

//Done
