package org.solo.basic;

import java.util.HashMap;
import java.util.Map;

//Find frequency of each character
public class Question7 {
    public static void main(String[] args) {
        String name = "Amardeep Singh Cheema";
        //System.out.println(firstNonRepeatingCharBruteForceNaive(name.toLowerCase()));
        System.out.println(frequencyOfCharacter(name.toLowerCase()));
    }

    private static Map<Character,Integer> frequencyOfCharacter(String name){
        if(null==name && name.isEmpty()){
            return null;
        }

        Map<Character,Integer> frequency = new HashMap<>();
        for(int i=0;i<name.length();i++){
            char character = name.charAt(i);
            frequency.put(character,frequency.getOrDefault(character,0)+1);
        }

        return frequency;
    }
}
