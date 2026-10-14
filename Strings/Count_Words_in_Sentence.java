package Strings;

public class Count_Words_in_Sentence {
    public static void main(String[] args) {
        String str = "Java is easy to learn";
        str = str.trim();

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = str.split("\\s+");
            System.out.println(words.length);
        }
    }
}
