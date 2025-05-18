import java.util.Scanner;


//Program to check input number is divisible by 5 or not 
public class CheckDivisibleByFiveOrNot {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter any number:");
        num=sc.nextInt();
        if(num%5==0) System.out.println("Yes, the number is divisible by five");
        else{
            System.out.println("No, the numbr is not divisible by 5");
        }
    }
}
//Output
// Enter any number:
// 40
// Yes, the number is divisible by five