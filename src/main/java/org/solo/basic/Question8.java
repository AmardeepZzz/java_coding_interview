package org.solo.basic;

import java.util.Arrays;

//Check if two strings are anagrams
public class Question8 {

    public static void main(String[] args) {
        String s1 = "worth";
        String s2 = "throw";
        System.out.println(checkTwoStringAreAnagrams(s1,s2));
    }

    private static boolean checkTwoStringAreAnagrams(String s1,String s2){

        if(s1.length() == s2.length()){
            char[] chars1 = new char[s1.length()];
            char[] chars2 = new char[s2.length()];
            for(int i=0;i<s1.length();i++){
                chars1 = s1.toCharArray();
                Arrays.sort(chars1);
            }
            for(int i=0;i<s2.length();i++) {
                chars2 = s2.toCharArray();
                Arrays.sort(chars2);
            };
            return Arrays.equals(chars1,chars2);
        }else{
            System.out.println("Strings Length not matched not an anagrams");
        }

        return false;
    }
}
