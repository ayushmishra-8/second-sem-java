
// Print this pattern, total line is given.

// *
// **
// ***
// ****
// *****


public class StarTriangel {
    public static void main(String[] args) {
        int i = 0;
        int line = 4;
        for (i = 0; i <= line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
//Done