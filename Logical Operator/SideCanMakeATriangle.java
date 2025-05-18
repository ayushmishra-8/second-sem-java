import java.util.Scanner;
//Program to check that sides can make a triangle or not 
public class SideCanMakeATriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all side: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Sides must be positive numbers.");
        } else if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
            System.out.println("Yes it can make a triangle.");
        } else{
            System.out.println("It can not make a triangle");
        }
    }
}
// output
// Enter all side: 
// 4 5 7 
// Yes it can make a triangle
