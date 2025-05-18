//Encrypt Decrypt grade by adding 8 and subtracting 8 from them

import java.util.*;

import java.util.Scanner;

public class EncryptAndDecryptGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade number: ");
        int grade = scanner.nextInt();

        int encryptedGrade = grade + 8;
        System.out.println("Encrypted grade is " + encryptedGrade);

        int decryptedGrade = encryptedGrade - 8;
        System.out.println("Decrypted grade is " + decryptedGrade);
    }
}

// Done
