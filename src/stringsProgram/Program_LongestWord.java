
package stringsProgram;

public class Program_LongestWord {

    public static void main(String[] args) {
        String str = "Java is a good language";

        String longestWord = "";
        int longestLen = 0;

        int start = 0; // start index of the current word
        for (int i = 0; i <= str.length(); i++) {
            // When we hit a space or the end, we have a complete word [start, i)
            if (i == str.length() || str.charAt(i) == ' ') {
                int wordLen = i - start;
                if (wordLen > 0) { // avoid multiple spaces
                    String word = str.substring(start, i);
                    if (wordLen > longestLen) {
                        longestLen = wordLen;
                        longestWord = word;
                    }
                }
                start = i + 1; // next word starts after the space
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestLen);
    }
}
