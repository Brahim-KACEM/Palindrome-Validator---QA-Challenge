/**
 * A utility class for validating palindromes.
 * A palindrome is a string that reads the same forward and backward,
 * ignoring case, spaces, and punctuation.
 */
public class PalindromeValidator {
    
    /**
     * Checks if a given string is a palindrome.
     * 
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        // Handle null or empty strings
        if (input == null || input.isEmpty()) {
            return false;
        }
        
        // Clean the string: remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Handle empty string after cleaning
        if (cleanedInput.isEmpty()) {
            return false;
        }
        
        // Check if the cleaned string is the same when reversed
        int left = 0;
        int right = cleanedInput.length() - 1;
        
        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
