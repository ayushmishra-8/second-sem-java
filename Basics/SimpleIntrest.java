
//Calculate simple intrest

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, r, t, si;
        System.out.println("Enter principle rate and time: ");
        p = sc.nextInt();// principle
        r = sc.nextInt();// rate
        t = sc.nextInt();// time
        si = (p * r * t) / 100;
        System.out.println("Simple intrest is: " + si);
    }

}
//Done