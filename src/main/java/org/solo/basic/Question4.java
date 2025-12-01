package org.solo.basic;

//Count vowels and consonants
public class Question4 {

    public static void main(String[] args) {
        basicLogic();
      //  proLogic();
    }

    public static void basicLogic(){
        String name = "Amardeep Singh Cheema";
        String[] splitName = name.split("");
        String vowels = "aeiou";
        String space = " ";
        int countVowels = 0;
        int countConsonants = 0;
        for (int i = 0; i < name.length(); i++) {
            if(space.contains(splitName[i])) {
                // System.out.println("skip");
            }else if (vowels.contains(splitName[i].toLowerCase())) {
                countVowels++;
            } else {
                countConsonants++;
            }
        }
        System.out.println("Count Vowels : " + countVowels);
        System.out.println("Count Consonants : " + countConsonants);
    }

    public static void proLogic(){

        String inputString = "Amardeep Singh Cheema";

        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to simplify vowel checking
        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Original String: " + inputString);
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);

    }

}
