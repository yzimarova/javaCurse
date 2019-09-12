package homework3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a sentence: ");
        String sentence = in.nextLine();
        in.close();
        upendWords(splitSentence(sentence));
    }

    public static String[] splitSentence(String sentence) {
        String[] words = sentence.split(" ");
        return words;
    }

    public static void upendWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int y = 0; y < word.length/2; y++) {
                char temp = word[y];
                word[y] = word[word.length - (y + 1)];
                word[word.length - (y + 1)] = temp;
            }
            System.out.print(new String(word));
            System.out.print(" ");
        }
    }
}
