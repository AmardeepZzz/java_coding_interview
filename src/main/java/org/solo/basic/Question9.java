package org.solo.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Reverse each word in a sentence
public class Question9 {

    public static void main(String[] args) {
        String name = "Amardeep Singh Cheema";
        System.out.println(reverseWordInSentence(name));
    }

    private static String reverseWordInSentence(String sentence){
        if(null==sentence || sentence.isEmpty()){
            return null;
        }
        String[] sentenceList = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String s: sentenceList){
            builder.append(new StringBuilder(s).reverse().append(" "));
        }
        return builder.toString();
    }
}
