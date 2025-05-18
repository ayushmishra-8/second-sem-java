
import java.util.Scanner;



public class YoungestOfThree {
    public static void main(String[] args) {
        int ram, shyam, lakhan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of ram: ");
        ram = sc.nextInt();
        System.out.print("Enter the age of shyam: ");
        shyam = sc.nextInt();
        System.out.print("Enter the age of lakhan: ");
        lakhan = sc.nextInt();
        if (ram < shyam && ram < lakhan) {
            System.out.println("Ram is youngest");
        } else if (shyam < ram && shyam < lakhan) {
            System.out.println("Shyam is youngest");
        } else if (lakhan < ram && lakhan < shyam) {
            System.out.println("Lakhan is youngest");
        } else if (ram == shyam && shyam == lakhan) {
            System.out.println("All are of same age");

        }
    }

}
