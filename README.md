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

Comprehensive test suite covering the following scenarios:

#### 1. **Null and Empty Input Scenarios**
- **Scenario 1**: Pass `null` as input → Should return `false` (prevent crashes)
- **Scenario 2**: Pass empty string `""` → Should return `false` (no content to validate)
- **Scenario 3**: Pass string with only spaces `"   "` → Should return `false` (becomes empty after cleaning)
- **Scenario 4**: Pass string with only punctuation `".,!?"` → Should return `false` (no valid characters)

#### 2. **Simple Palindrome Scenarios**
- **Scenario 5**: Single character `"a"` → Should return `true` (trivial palindrome)
- **Scenario 6**: Two identical characters `"aa"` → Should return `true` (simplest multi-char palindrome)
- **Scenario 7**: Three character palindrome `"aba"` → Should return `true` (odd-length palindrome)
- **Scenario 8**: Common palindrome word `"racecar"` → Should return `true` (classic example)
- **Scenario 9**: Other palindrome words `"level"`, `"noon"`, `"radar"` → Should return `true`

#### 3. **Case Sensitivity Scenarios**
- **Scenario 10**: Mixed case palindrome `"Racecar"` → Should return `true` (ignore case)
- **Scenario 11**: Varied case palindrome `"RaceCar"` → Should return `true` (ignore case)
- **Scenario 12**: All uppercase palindrome `"LEVEL"` → Should return `true` (ignore case)
- **Scenario 13**: Mixed case short palindromes `"MaM"`, `"AbA"` → Should return `true`

#### 4. **Punctuation and Space Handling Scenarios**
- **Scenario 14**: Palindrome with space `"race car"` → Should return `true` (ignore spaces)
- **Scenario 15**: Palindrome with comma `"race, car"` → Should return `true` (ignore commas)
- **Scenario 16**: Palindrome with period `"race. car"` → Should return `true` (ignore periods)
- **Scenario 17**: Palindrome with exclamation `"race! car"` → Should return `true` (ignore punctuation)
- **Scenario 18**: Palindrome with question mark `"race? car"` → Should return `true`
- **Scenario 19**: Palindrome with colon `"race: car"` → Should return `true`
- **Scenario 20**: Palindrome with semicolon `"race; car"` → Should return `true`
- **Scenario 21**: Palindrome with hyphen `"race-car"` → Should return `true`

#### 5. **Complex Real-World Palindrome Scenarios**
- **Scenario 22**: Famous palindrome `"A man, a plan, a canal: Panama"` → Should return `true`
- **Scenario 23**: Sentence palindrome `"Was it a car or a cat I saw?"` → Should return `true`
- **Scenario 24**: Classic phrase `"Madam, I'm Adam"` → Should return `true`
- **Scenario 25**: Word palindrome `"Never odd or even"` → Should return `true`
- **Scenario 26**: Apostrophe palindrome `"No 'x' in Nixon"` → Should return `true`
- **Scenario 27**: Complex sentence `"Mr. Owl ate my metal worm"` → Should return `true`

#### 6. **Non-Palindrome Scenarios (Negative Tests)**
- **Scenario 28**: Common word `"hello"` → Should return `false` (not a palindrome)
- **Scenario 29**: Another word `"world"` → Should return `false`
- **Scenario 30**: Programming term `"java"` → Should return `false`
- **Scenario 31**: Longer word `"programming"` → Should return `false`
- **Scenario 32**: Misleading phrase `"almost a palindrome"` → Should return `false`
- **Scenario 33**: Clear non-palindrome `"not a palindrome"` → Should return `false`
- **Scenario 34**: Number sequence `"12345"` → Should return `false`

#### 7. **Edge Case and Boundary Scenarios**
- **Scenario 35**: Single digit `"1"` → Should return `true` (numeric palindrome)
- **Scenario 36**: Three-digit numeric palindrome `"121"` → Should return `true`
- **Scenario 37**: Five-digit numeric palindrome `"12321"` → Should return `true`
- **Scenario 38**: Alphanumeric palindrome `"a1b1a"` → Should return `true`
- **Scenario 39**: Mixed case alphanumeric `"A1B1a"` → Should return `true`
- **Scenario 40**: Complex alphanumeric `"a1b2b1a"` → Should return `true`
- **Scenario 41**: Very long palindrome (52 characters) → Should return `true` (performance test)

### Test Scenario Summary
- **Total Scenarios**: 41 comprehensive test scenarios
- **Positive Tests**: 33 scenarios (valid palindromes that should return `true`)
- **Negative Tests**: 11 scenarios (invalid inputs or non-palindromes that should return `false`)
- **Edge Cases**: 7 scenarios covering boundary conditions
- **Error Handling**: 4 scenarios for null/empty input validation

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
