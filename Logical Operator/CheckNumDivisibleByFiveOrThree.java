
import java.util.Scanner;



public class CheckNumDivisibleByFiveOrThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");
        num= sc.nextInt();
        if(num%5==0 || num%3==0) System.out.println("Yes it is a divisible by five of three");
        else{
            System.out.println("No it is not divisible by five or three");
        }
    }
}
// Output
// Enter any number: 
// 400
// Yes it is a divisible by five of three