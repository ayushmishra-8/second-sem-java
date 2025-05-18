import java.util.Scanner;

public class XYAxis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x,y;
        System.out.println("Enter the points of X and Y axis: ");
        x=sc.nextInt();
        y= sc.nextInt();
        // if(x==0&&y==0){
        //     System.out.println("Points on origin");
        // }
        // else if ((x>0&&y==0)||(x<0&&y==0)) {
        //     System.out.println("Point fall on x axis only");
            
        // }
        // else if ((y>0&&x==0)||(y<0&&x==0)) {
        //     System.out.println("Point fall on y axis only");
            
        // }
        // else if ((x>0&&y>0)||(x<0&&y<0)) {
        //     System.out.println("Fall on both x and y axis");
        // }

        //To check which quadrant
        if(x==0&&y==0){
            System.out.println("Origin");
        }
        else if (x==0){
            System.out.println("Lies on Y axis ");
        }
        else if(y==0){
            System.out.println("Lies on X axis");
        }
        else if(x>0&&y>0){
            System.out.println("Lies on First quadrant");
        }
        else if(x<0&&y>0){
             System.out.println("Lies on Second quadrant");
        }
        else if(x<0&&y<0){
             System.out.println("Lies on Third quadrant");
        }
        else {
             System.out.println("Lies on Fourth quadrant");
        }
        sc.close();

    }
}
//Output
// Enter the points of X and Y axis: 
// -4
// 8
// Lies on Second quadrant