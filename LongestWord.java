public class LongestWord {
    public static void main(String[] args) {
        String[] words = {"cat", "flag", "green", "country", "w3resource"};

        int maxLength = 0;

        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }

        System.out.println("Longest word(s):");

        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }
    }
}