import java.util.Scanner;

//Program to check the arae of rectangle is grater than its parammeter or not
public class CheckAreaGreaterThanParameter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double area, parameter, l, w;

        System.out.println("Enter length and width of rectangle respectively: ");
        l=sc.nextDouble();
        w=sc.nextDouble();
        area=(l*w);
        parameter=2*(l+w);

        if(area==parameter) System.out.println("both are equal");
        else if(area>parameter){
            System.out.println("Area is grater than parameter");
        }
        else{
            System.out.println("NO arae is  not greater than parameter");
        }
        sc.close();
    }
}
// Output
// Enter length and width of rectangle respectively: 
// 4 5
// Area is grater than parameter