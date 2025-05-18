
//Positive, Negative or Zero

import java.util.Scanner;

public class  CheckNumber{

    public static void main(String[] arg) {

        // Make object refrence for scanner class
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any numbber: ");
        num = sc.nextInt();

        // If else statement to check the number
        if (num == 0)
            System.out.println("The number is Zero ");

        else if (num > 0)
            System.out.println("This number is a positive number  ");

        else if (num < 0) {
            System.out.println("The number is a Negative number ");
        }

        else{
            System.out.println("Invalid input");
        }
    }

}
//Done