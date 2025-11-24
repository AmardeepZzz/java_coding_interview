package org.solo.basic;

//Check if a string is palindrome
public class Question3 {

    public static void main(String[] args) {
        String palindromeString = "11211";
        StringBuilder stringBuilder = new StringBuilder(palindromeString);
        String reversedPalidromeString = stringBuilder.reverse().toString();
        if (reversedPalidromeString.equalsIgnoreCase(palindromeString)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is not a Palindrome");
        }
    }
}
