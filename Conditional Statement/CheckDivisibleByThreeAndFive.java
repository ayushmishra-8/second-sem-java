
//Check if Number is Divisible by Both 3 and 5

import java.util.Scanner;
public class CheckDivisibleByThreeAndFive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        int num;
        System.out.print("Enter any number to check:");
        num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Yes the number " +num+ " is visiblle by 3 and 5 both");
        }

        else{
            System.out.println("No the number "+num+ " is not divisible by 3 and 5 both");
        }
    }
}
//Done