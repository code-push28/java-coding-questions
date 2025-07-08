package strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 Anagram Checker in Java 

 This program checks whether two given strings are anagrams of each other.
 An anagram is formed by rearranging the characters of a word or phrase
 to produce a new word or phrase using all original characters exactly once.

     Examples:
    "listen" ↔ "silent" → Anagram 
    "map" ↔ "pam" →  Anagram
    "hello" ↔ "world" →  Not Anagram

   Logic Used:
 - Convert both strings to lowercase
 - Remove any whitespace (optional, based on use case)
 - Convert to char arrays and sort them
 - Compare sorted arrays using Arrays.equals()


*/

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        /*
        "listen" → {'l','i','s','t','e','n'} → sorted → ['e','i','l','n','s','t']
        "silent" → {'s','i','l','e','n','t'} → sorted → ['e','i','l','n','s','t']
        ✅ Both sorted arrays are equal → Anagram
        */

        // Normalize strings: lowercase + remove spaces
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams ❌");
        } else {
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            if (Arrays.equals(charArr1, charArr2)) {
                System.out.println("Strings are anagrams ✅");
            } else {
                System.out.println("Strings are not anagrams ❌");
            }
        }
    }
}
