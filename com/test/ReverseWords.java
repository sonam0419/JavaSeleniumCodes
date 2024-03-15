package com.test;
public class ReverseWords {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String reversedString = reverseWords(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseWords(String inputString) {
        // Split the input string into words
        String[] words = inputString.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        // Reverse each word and append to the reversedString
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedString.append(reversedWord).append(" ");
        }

        // Remove trailing space and return the reversed string
        return reversedString.toString().trim();
    }
}
