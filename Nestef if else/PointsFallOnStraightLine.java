import java.util.Scanner;
//program to check point falls on straight line or not 
public class PointsFallOnStraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3,check1, check2;
        System.out.println("Enter value of point x1 x2 x3 respectively: ");
        x1=sc.nextDouble();
        x2=sc.nextDouble();
        x3=sc.nextDouble();
        System.out.println("Enter value of point y1 y2 y3 respectively: ");
        y1=sc.nextDouble();
        y2=sc.nextDouble();
        y3=sc.nextDouble();
        check1= (y2-y1)/(x2-x1);
        check2= (y3-y2)/(x3-x2);
        if(check1==check2){
            System.out.println("Yes the point falls on straight line");

        }
        else{
            System.out.println("No the point does not falls on straight line.");
        }
    }
}
// Output
// Enter value of point x1 x2 x3 respectively: 
// 2
// 3
// 4
// Enter value of point y1 y2 y3 respectively: 
// 4
// 3
// 2
// Yes the point falls on straight line
