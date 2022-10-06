package com.bridgelabz.JavaDay1Prob;

public class StringsEqualOrNot {
    static void StringCheck() {
        String s1 = new String("Java");
        String s2 = new String("Python");
        if (s1.equals(s2))
            System.out.println("Two Strings are Equal");
        else
            System.out.println("Not Equal");
    }
    public static void main(String[] args) {
        StringCheck();
    }
}