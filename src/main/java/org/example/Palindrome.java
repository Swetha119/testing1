package org.example;

public class Palindrome {
    public static void main(String[] args) {
        String Char = "racecar";
        boolean isPalindrome = isPalindrome(Char);
        if (isPalindrome) {
            System.out.println(Char + " is a palindrome.");
        }
        else {
            System.out.println(Char + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
