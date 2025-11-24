package org.solo.basic;

//Reverse a string without using reverse()
public class Question2 {

    public static void main(String[] args) {

        String name = "Amardeep";
        String[] splitName = name.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= name.length(); i++) {
            stringBuilder.append(splitName[name.length() - i]);
        }
        System.out.println(stringBuilder);
    }
}
