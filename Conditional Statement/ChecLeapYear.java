import java.util.Scanner;
//Program to check leap year or nnot 
public class ChecLeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)|| (year %400==0)){
            System.out.println("Yes the year " +year+" is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
//Output
// Enter any year: 400
// Yes the year 400 is a leap year