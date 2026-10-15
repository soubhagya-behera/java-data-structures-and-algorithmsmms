package Strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is easy";
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}