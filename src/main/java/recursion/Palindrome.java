package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";

        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println(result);
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1);
    }
}
// Time complexity  = O(n)

/*
The line Palindrome palindromeChecker = new Palindrome(); creates an instance of the
Palindrome class and assigns it to the variable palindromeChecker.
This is an instance of the class that can be used to call non-static
methods or access non-static fields of the Palindrome class.

In the provided code, the isPalindrome method is an instance method,
meaning it belongs to an instance of the class Palindrome. To use this method, you need to create an instance of the class.
That's why the line Palindrome palindromeChecker = new Palindrome(); is necessary.

If the isPalindrome method were declared as static,
you could call it directly on the class without creating an instance, like this:
 */

