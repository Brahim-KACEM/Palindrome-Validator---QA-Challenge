# Palindrome Validator - QA Challenge

This project implements a robust palindrome validator in Java with comprehensive test cases.

## Overview

A palindrome is a string that reads the same forward and backward, ignoring case, spaces, and punctuation. For example:
- "A man, a plan, a canal: Panama" → "amanaplanacanalpanama" (palindrome)
- "racecar" → "racecar" (palindrome)
- "hello" → "olleh" (not a palindrome)

## Implementation

### `PalindromeValidator.java`

The main implementation contains:

1. **`isPalindrome(String input)`** - Primary method that:
   - Handles null/empty strings (returns false)
   - Removes non-alphanumeric characters using regex `[^a-zA-Z0-9]`
   - Converts to lowercase for case-insensitive comparison
   - Uses two-pointer technique for efficient palindrome checking



### Key Features

- ✅ Handles null and empty strings
- ✅ Case-insensitive comparison
- ✅ Ignores spaces and punctuation
- ✅ Efficient O(n) time complexity
- ✅ O(1) space complexity (excluding input cleaning)

## Test Cases

### `PalindromeValidatorTest.java`

Comprehensive test suite covering:

1. **Null and Empty Strings**
   - null values
   - empty strings
   - strings with only spaces/punctuation

2. **Simple Palindromes**
   - Single characters
   - Basic words (racecar, level, noon, radar)

3. **Case Sensitivity**
   - Mixed case palindromes
   - All uppercase/lowercase variations

4. **Spaces and Punctuation**
   - Various punctuation marks (commas, periods, exclamation marks, etc.)
   - Multiple spaces

5. **Complex Palindromes**
   - Famous palindromic phrases
   - Real-world examples with mixed punctuation

6. **Non-Palindromes**
   - Regular words and phrases
   - Edge cases that might confuse the algorithm

7. **Edge Cases**
   - Numeric palindromes
   - Alphanumeric combinations
   - Very long strings

## How to Run

### Compile and Run Tests

```bash
# Compile the Java files
javac PalindromeValidator.java PalindromeValidatorTest.java

# Run the test suite
java PalindromeValidatorTest
```

### Expected Output

The test suite will run all test cases and display:
- Individual test results (✓ PASS or ✗ FAIL)
- Summary statistics
- Overall success rate

Example output:
```
Running Palindrome Validator Tests...

Testing null and empty strings:
✓ PASS: null string
✓ PASS: empty string
✓ PASS: string with only spaces
✓ PASS: string with only punctuation

Testing simple palindromes:
✓ PASS: single character 'a'
✓ PASS: double character 'aa'
...

==================================================
TEST RESULTS:
Total tests: 44
Passed: 44
Failed: 0
Success rate: 100.00%

 All tests passed! The palindrome validator is working correctly.
```

## Algorithm Explanation

The implementation uses a two-pointer approach:

1. **Preprocessing**: Remove non-alphanumeric characters and convert to lowercase
2. **Validation**: Compare characters from both ends moving toward the center
3. **Early termination**: Return false immediately if any mismatch is found

This approach is efficient and handles all the specified requirements:
- Time Complexity: O(n) where n is the length of the input string
- Space Complexity: O(n) for the cleaned string (could be optimized to O(1) with in-place validation)

## Quality Assurance Notes

This implementation follows QA best practices:
- **Comprehensive test coverage** including edge cases
- **Clear documentation** and comments
- **Robust error handling** for null/empty inputs
- **Multiple validation approaches** for verification
- **Detailed test reporting** with pass/fail indicators

The test suite validates correctness across various scenarios ensuring the implementation meets all specified requirements.
