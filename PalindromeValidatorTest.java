
public class PalindromeValidatorTest {
    
    private static int testCount = 0;
    private static int passedTests = 0;
    
    public static void main(String[] args) {
        System.out.println("Running Palindrome Validator Tests...\n");
        
        // Test null and empty strings
        testNullAndEmptyStrings();
        
        // Test simple palindromes
        testSimplePalindromes();
        
        // Test case sensitivity
        testCaseSensitivity();
        
        // Test spaces and punctuation
        testSpacesAndPunctuation();
        
        // Test complex palindromes
        testComplexPalindromes();
        
        // Test non-palindromes
        testNonPalindromes();
        
        // Test edge cases
        testEdgeCases();
        
        // Print test results
        printTestResults();
    }
    
    private static void testNullAndEmptyStrings() {
        System.out.println("Testing null and empty strings:");
        
        // Test null string
        assertFalse(PalindromeValidator.isPalindrome(null), "null string");
        
        // Test empty string
        assertFalse(PalindromeValidator.isPalindrome(""), "empty string");
        
        // Test string with only spaces
        assertFalse(PalindromeValidator.isPalindrome("   "), "string with only spaces");
        
        // Test string with only punctuation
        assertFalse(PalindromeValidator.isPalindrome(".,!?"), "string with only punctuation");
        
        System.out.println();
    }
    
    private static void testSimplePalindromes() {
        System.out.println("Testing simple palindromes:");
        
        assertTrue(PalindromeValidator.isPalindrome("a"), "single character 'a'");
        assertTrue(PalindromeValidator.isPalindrome("aa"), "double character 'aa'");
        assertTrue(PalindromeValidator.isPalindrome("aba"), "simple palindrome 'aba'");
        assertTrue(PalindromeValidator.isPalindrome("racecar"), "word 'racecar'");
        assertTrue(PalindromeValidator.isPalindrome("level"), "word 'level'");
        assertTrue(PalindromeValidator.isPalindrome("noon"), "word 'noon'");
        assertTrue(PalindromeValidator.isPalindrome("radar"), "word 'radar'");
        
        System.out.println();
    }
    
    private static void testCaseSensitivity() {
        System.out.println("Testing case sensitivity:");
        
        assertTrue(PalindromeValidator.isPalindrome("Racecar"), "mixed case 'Racecar'");
        assertTrue(PalindromeValidator.isPalindrome("RaceCar"), "mixed case 'RaceCar'");
        assertTrue(PalindromeValidator.isPalindrome("LEVEL"), "uppercase 'LEVEL'");
        assertTrue(PalindromeValidator.isPalindrome("MaM"), "mixed case 'MaM'");
        assertTrue(PalindromeValidator.isPalindrome("AbA"), "mixed case 'AbA'");
        
        System.out.println();
    }
    
    private static void testSpacesAndPunctuation() {
        System.out.println("Testing spaces and punctuation:");
        
        assertTrue(PalindromeValidator.isPalindrome("race car"), "palindrome with space");
        assertTrue(PalindromeValidator.isPalindrome("race, car"), "palindrome with comma");
        assertTrue(PalindromeValidator.isPalindrome("race. car"), "palindrome with period");
        assertTrue(PalindromeValidator.isPalindrome("race! car"), "palindrome with exclamation");
        assertTrue(PalindromeValidator.isPalindrome("race? car"), "palindrome with question mark");
        assertTrue(PalindromeValidator.isPalindrome("race: car"), "palindrome with colon");
        assertTrue(PalindromeValidator.isPalindrome("race; car"), "palindrome with semicolon");
        assertTrue(PalindromeValidator.isPalindrome("race-car"), "palindrome with hyphen");
        
        System.out.println();
    }
    
    private static void testComplexPalindromes() {
        System.out.println("Testing complex palindromes:");
        
        assertTrue(PalindromeValidator.isPalindrome("A man, a plan, a canal: Panama"), 
                  "classic palindrome 'A man, a plan, a canal: Panama'");
        assertTrue(PalindromeValidator.isPalindrome("Was it a car or a cat I saw?"), 
                  "palindrome 'Was it a car or a cat I saw?'");
        assertTrue(PalindromeValidator.isPalindrome("Madam, I'm Adam"), 
                  "palindrome 'Madam, I'm Adam'");
        assertTrue(PalindromeValidator.isPalindrome("Never odd or even"), 
                  "palindrome 'Never odd or even'");
        assertTrue(PalindromeValidator.isPalindrome("No 'x' in Nixon"), 
                  "palindrome 'No 'x' in Nixon'");
        assertTrue(PalindromeValidator.isPalindrome("Mr. Owl ate my metal worm"), 
                  "palindrome 'Mr. Owl ate my metal worm'");
        
        System.out.println();
    }
    
    private static void testNonPalindromes() {
        System.out.println("Testing non-palindromes:");
        
        assertFalse(PalindromeValidator.isPalindrome("hello"), "word 'hello'");
        assertFalse(PalindromeValidator.isPalindrome("world"), "word 'world'");
        assertFalse(PalindromeValidator.isPalindrome("java"), "word 'java'");
        assertFalse(PalindromeValidator.isPalindrome("programming"), "word 'programming'");
        assertFalse(PalindromeValidator.isPalindrome("almost a palindrome"), "phrase 'almost a palindrome'");
        assertFalse(PalindromeValidator.isPalindrome("not a palindrome"), "phrase 'not a palindrome'");
        assertFalse(PalindromeValidator.isPalindrome("12345"), "numbers '12345'");
        
        System.out.println();
    }
    
    private static void testEdgeCases() {
        System.out.println("Testing edge cases:");
        
        assertTrue(PalindromeValidator.isPalindrome("1"), "single digit '1'");
        assertTrue(PalindromeValidator.isPalindrome("121"), "numeric palindrome '121'");
        assertTrue(PalindromeValidator.isPalindrome("12321"), "numeric palindrome '12321'");
        assertTrue(PalindromeValidator.isPalindrome("a1b1a"), "alphanumeric palindrome 'a1b1a'");
        assertTrue(PalindromeValidator.isPalindrome("A1B1a"), "mixed case alphanumeric 'A1B1a'");
        
        // Test with Unicode characters (basic test)
        assertTrue(PalindromeValidator.isPalindrome("a1b2b1a"), "mixed alphanumeric palindrome");
        
        // Test very long palindrome
        String longPalindrome = "abcdefghijklmnopqrstuvwxyz" + "zyxwvutsrqponmlkjihgfedcba";
        assertTrue(PalindromeValidator.isPalindrome(longPalindrome), "very long palindrome");
        
        System.out.println();
    }
    
    // Helper method to assert true condition
    private static void assertTrue(boolean condition, String testDescription) {
        testCount++;
        if (condition) {
            passedTests++;
            System.out.println("✓ PASS: " + testDescription);
        } else {
            System.out.println("✗ FAIL: " + testDescription + " (expected true, got false)");
        }
    }
    
    // Helper method to assert false condition
    private static void assertFalse(boolean condition, String testDescription) {
        testCount++;
        if (!condition) {
            passedTests++;
            System.out.println("✓ PASS: " + testDescription);
        } else {
            System.out.println("✗ FAIL: " + testDescription + " (expected false, got true)");
        }
    }
    
    private static void printTestResults() {
        System.out.println("=".repeat(50));
        System.out.println("TEST RESULTS:");
        System.out.println("Total tests: " + testCount);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + (testCount - passedTests));
        System.out.println("Success rate: " + String.format("%.2f%%", (double) passedTests / testCount * 100));
        
        if (passedTests == testCount) {
            System.out.println("\n All tests passed! The palindrome validator is working correctly.");
        } else {
            System.out.println("\n Some tests failed. Please review the implementation.");
        }
    }
}
