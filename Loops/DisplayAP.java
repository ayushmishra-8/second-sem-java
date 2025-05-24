//Program to print till n th term of Ap 
 //Ap is 1,3,5,7,9,upto n
 
import java.util.Scanner;

public class DisplayAP {
    public static void main(String[] args) {
        //Ap is 1,3,5,7,9,upto n
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n th term: ");
        int n = sc.nextInt();
        for(int i = 1;i<=(2*n-1); i+=2){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
//Output
// Enter n th term: 6
// 1 3 5 7 9 11 
