package Strings;

import java.util.Arrays;

public class Check_Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] first = str1.toLowerCase().toCharArray();
        char[] second = str2.toLowerCase().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first, second)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
