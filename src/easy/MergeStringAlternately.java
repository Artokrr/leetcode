package easy;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(word1.length() + word2.length());
        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (minLength < word1.length()) {
            result.append(word1.substring(minLength));
        }

        if (minLength < word2.length()) {
            result.append(word2.substring(minLength));
        }
        return result.toString();
    }
}
