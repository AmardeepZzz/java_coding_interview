package org.solo.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Find first non-repeated character in a string
public class Question6 {

    public static void main(String[] args) {
        String name = "Amardeep Singh Cheema";
        //System.out.println(firstNonRepeatingCharBruteForceNaive(name.toLowerCase()));
        System.out.println(firstNonRepeatingCharBruteForce(name.toLowerCase()));
    }

    //O(n2)
    public static Character firstNonRepeatingCharBruteForceNaive(String inputString){
        if(null == inputString && inputString.isEmpty()){
            return null;
        }

        for(int outer=0;outer<inputString.length();outer++){
            boolean repeat = false;
            for(int inner=0;inner<inputString.length();inner++){
                if(inner!=outer && inputString.charAt(outer) == inputString.charAt(inner)){
                    repeat = true;
                    break;
                }
            }
            if(!repeat){
                return inputString.charAt(outer);
            }
        }
        return null;
    }

    public static Character firstNonRepeatingCharBruteForce(String name){
        if(null==name || name.isEmpty()){
            return null;
        }
        Map<Character,Integer> frequency = new HashMap<>();
        for(int i=0;i<name.length();i++){
            char character = name.charAt(i);
            frequency.put(name.charAt(i),frequency.getOrDefault(character,0)+1);
        }
        for(Character c : name.toCharArray()){
            if(frequency.get(c) == 1){
                return c;
            }
        }
        return null;
    }
}
