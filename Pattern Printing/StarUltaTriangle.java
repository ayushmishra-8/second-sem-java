// print pattern like total line is given
// ****
// ***
// **
// *


public class StarUltaTriangle {
    public static void main(String[] Args) {
        int line =4 ;
        for (int i = line; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
           System.out.println();
        }
    }

}
//Done