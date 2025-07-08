package strings;

import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // ============================
        // 1️⃣ Using StringBuilder
        // ============================
        StringBuilder sb = new StringBuilder(str);
        String reversedUsingBuilder = sb.reverse().toString();
        System.out.println("\n1. Reverse using StringBuilder: " + reversedUsingBuilder);

        // ============================
        // 2️⃣ Using for loop (charAt)
        // ============================
        String reversedUsingLoop = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedUsingLoop += str.charAt(i);
        }
        System.out.println("2. Reverse using for loop: " + reversedUsingLoop);

        // ============================
        // 3️⃣ Using char array
        // ============================
        char[] originalArr = str.toCharArray(); // convert string to char array
        char[] reversedArr = new char[originalArr.length];

        int j = 0;
        for (int i = originalArr.length - 1; i >= 0; i--) {
            reversedArr[j++] = originalArr[i];
        }

        String reversedUsingArray = new String(reversedArr);
        System.out.println("3. Reverse using char array: " + reversedUsingArray);

        sc.close();
    }
}
