//Program to check greater number among three 

import java.util.*;
public class GreatestAmongThree{
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any three values: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if(a==b && b==c){
            System.out.println("All are equal");
        }
        else if(a>b){
            if(a>c){
                System.out.println(a+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println(b+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        scanner.close();
    }
}
//done