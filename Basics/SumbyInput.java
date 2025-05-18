//Java code for taking input from user and print sum by showing Sum in last system.out.println()


import java.util.*;

public class SumbyInput {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter the value of a and b \n");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum: "+(a+b));
        
        sc.close();
    }
}
