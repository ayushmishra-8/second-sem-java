import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enetr nth term: : ");
        int n = scanner.nextInt();
        int sum=0;
        for(int i = 1; i<=n;i++){
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
       
    }
}
