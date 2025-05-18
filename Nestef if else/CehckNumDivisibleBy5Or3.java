import java.util.Scanner;
//Check num is divided by 5 or 3 but not by 15

public class CehckNumDivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("ENter any number: ");
        num= sc.nextInt();      
        if(num%5==0||num%3==0){
            if(num%15!=0){
                System.out.println("Number is divisible by 5 or 3 but not by 15");
            }
            else{
                System.out.println("Number is divisible by 15");
            }
        }
        else{
            System.out.println("Not matching the required condition");
        }
        sc.close();
    }
}
// Output
// ENter any number: 
// 40
// Number is divisible by 5 or 3 but not by 15