package org.solo.basic;

//Count vowels and consonants
public class Question4 {

    public static void main(String[] args) {
        basicLogic();

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

    }

    public static boolean isVowels(){
        return false;
    }

    public static boolean isConsonants(){
        return true;
    }
}
