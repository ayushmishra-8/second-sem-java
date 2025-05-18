import java.util.Scanner;
public class StarPlus {
    public static void main(String[] arg) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter number of row(must be a odd number): ");
            int row=sc.nextInt();
           int check=(row/2)+1;
            

            for(int i=1;i<=row;i++){
                for(int j =1;j<=row;j++){
                    if(i==check||j==check){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
    }
}
//this question works only for odd number of rows