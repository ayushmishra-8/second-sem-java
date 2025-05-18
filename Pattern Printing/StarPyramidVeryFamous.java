import java.util.Scanner;

public class StarPyramidVeryFamous {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int check=1;
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int k=1;k<=check;k++){
                System.out.print("*");

            }
            check+=2;
            System.out.println();
        }
    }

}
//done
// // Enter n: 
// 6

/* 
     *
    ***
   *****
  *******
 *********
*********** */