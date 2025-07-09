package strings;

public class FindDuplicates {

    public static void main(String[] args) {

        // Input string
        String str = "programmingg";

        // To store already printed duplicate characters
        String printed = "";

        // Outer loop to check each character
        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            int count = 1;

            // Skip if character already printed as duplicate
            if (printed.indexOf(current) != -1) {
                continue;
            }

            // Inner loop to count occurrences of current character
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }

            // If character appears more than once, print and store it
            if (count > 1) {
                printed = printed + current;
                System.out.print(current + " ");
            }
        }
    }
}
