//Percentage of five subject 
import java.util.Scanner;

public class PercentageOfFiveSubject {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of five subject out of 100:");
        double m, c, b, e, h;
        
        m = sc.nextDouble();
        c = sc.nextDouble();
        b = sc.nextDouble();
        e = sc.nextDouble();
        h = sc.nextDouble();

        double percentage=(m+c+b+e+h)/500*100;
        System.out.println("Percentage is : "+percentage);

    }
}
//Done