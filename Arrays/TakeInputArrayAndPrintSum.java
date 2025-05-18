import java.util.*;

public class TakeInputArrayAndPrintSum {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < 5; i++) {
            array[i] = r.nextInt();
        }
        System.out.println("Entered elements in array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
