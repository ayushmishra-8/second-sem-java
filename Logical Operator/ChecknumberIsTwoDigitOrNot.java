import java.util.Scanner;

public class ChecknumberIsTwoDigitOrNot {
    

//Program to check input number is two digit or not 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99))
        
 {
            System.out.println("Yes, it is a two digit number");
        } else {
            System.out.println("Not a two digit number");
        }
    }


}
// output
// Enter any number: 
// -99
// Yes, it is a two digit number

