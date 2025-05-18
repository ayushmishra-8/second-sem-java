import java.util.*;
public class swap{
    public static void main (String[] Args){
         Scanner sc= new Scanner(System.in);
        int a,b;
        
        System.out.println("Enter the value of variable a:");
        a=sc.nextInt();
        
        System.out.println("Enter the value of variable b:");
        b=sc.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("After swapping:");

        
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        
        
        
        
    }
}
