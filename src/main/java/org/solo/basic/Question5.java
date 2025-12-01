package org.solo.basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Remove duplicate characters from a string
public class Question5 {

    public static void main(String[] args) {
        String inputString = "Amardeep Singh Cheema";
        String[] splitString = inputString.split("");
        Set<String> stringSet = new LinkedHashSet<>();
        for(int i=0;i<inputString.length();i++){
            stringSet.add(splitString[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : stringSet){
            stringBuilder.append(s);
        }

        System.out.println(stringBuilder.toString());

    }
}
