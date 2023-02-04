import java.util.Random;
import java.util.Scanner;


public class GuessWord {
    static String[] sourceWords = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    static int randomInt = new Random().nextInt(sourceWords.length);
    static String randomWord = sourceWords[randomInt];

    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);
        int maskWordLength = 15;
        String maskWord = "#".repeat(maskWordLength);
        String random = randomWord;
        for (int i = 0; i < (maskWordLength - randomWord.length() + i); i++) {
            randomWord = randomWord + "#";
        }
        System.out.println("Guess the word!");
        do {
            System.out.print("Enter a word: ");
            StringBuilder attemptWord = new StringBuilder(inputWord.nextLine());
            for (int i = 0; i < (maskWordLength - attemptWord.length() + i); i++) {
                attemptWord.append("#");
            }
            for (int i = 0; i < maskWord.length(); i++) {
                if (randomWord.charAt(i) == attemptWord.charAt(i)) {
                    maskWord = replaceLetter(Character.toString(attemptWord.charAt(i)), maskWord);
                }
            }
            System.out.println(maskWord);
        }
        while (!maskWord.equals(randomWord));
        System.out.println("You guess! It is " + random + "!");
    }

    private static String replaceLetter(String letter, String maskWord) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWord.charAt(i) == letter.charAt(0)) {
                stringBuilder.append(letter);
            } else if (maskWord.charAt(i) != '#') {
                stringBuilder.append(maskWord.charAt(i));
            } else {
                stringBuilder.append("#");
            }
        }
        return stringBuilder.toString();
    }
}