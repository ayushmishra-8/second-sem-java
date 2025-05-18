
//Finding remainder 

import java.util.Scanner;

public class FinfReaminder {

    public static void main(String[] args) {
        int divisor, r, dividend, q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend:");
        dividend = sc.nextInt();
        System.out.println("Enter divisor: ");
        divisor = sc.nextInt();
        q = dividend / divisor;
        r = dividend - (divisor * q);
        System.out.println("Reaminder is: " + r);
    }
}
// done