package strings;

/**
 * This program removes duplicate characters from a string
 * while preserving the original order of characters.
 *
 * Example:
 * Input  : "programming"
 * Output : "progamin"
 */
public class RemoveDuplicateFromString {

    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        // Traverse the string character by character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the character is already present in the result
            if (result.indexOf(currentChar) == -1) {
                result += currentChar; // Append the character if it's not a duplicate
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates: " + result);
    }
}
