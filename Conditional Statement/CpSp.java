import java.util.Scanner;

//Program to calculate profit and loss on selling goods

public class CpSp {
    public static void main(String[] args) {
        int Cp, Sp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yor Cp and Sp respectively: ");
        Cp = sc.nextInt();
        Sp = sc.nextInt();
        if (Cp == Sp)
            System.out.println("No profit No Loss");
        else if (Cp > Sp) {
            
            System.out.println("Loss of: "+(Cp-Sp));
        } else {
            System.out.println("Profit of: "+(Sp-Cp));
        }
        sc.close();
    }

}
// output
//Enter yor Cp and Sp respectively: 
// 40
// 20
// Loss of: 20
