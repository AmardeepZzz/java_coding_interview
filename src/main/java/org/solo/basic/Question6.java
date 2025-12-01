package org.solo.basic;

import java.util.Set;

//Find first non-repeated character in a string
public class Question6 {

    public static void main(String[] args) {
        String name = "Amardeep Singh Cheema";
        System.out.println(firstNonRepeatingCharBruteForceNaive(name.toLowerCase()));
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

    public static Character firstNonRepeatingCharBruteForce(){
        return null;
    }
}
