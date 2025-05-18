import java.util.Scanner;

//Program to find absolute value

public class PrintAbsolutevalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter any number:");
        num= sc.nextInt();
        if(num<0) num*=(-1);
       System.out.println(num);
       sc.close();
    }
}
// output
// Enter any number:-50
// 50