//Program to print table of n where n is input

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("The table of "+n+" is:");
        for (int i = n; i <= (n * 10); i += n) {
            System.out.println(i + " ");
        }
    }
}
//Output
// The table of 12 is:
// 12 
// 24 
// 36 
// 48 
// 60 
// 72 
// 84 
// 96 
// 108
// 120
