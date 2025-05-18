import java.util.Scanner;

//Program to check input number is three digit or not 

public class ChecknumberIsThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999))
        
 {
            System.out.println("Yes, it is a three digit number");
        } else {
            System.out.println("Not a three digit number");
        }
    }


}
// output
// Enter any number: 
// 450
// Yes, it is a three digit number
