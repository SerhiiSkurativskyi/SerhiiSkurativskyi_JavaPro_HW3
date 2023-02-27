public class Main {
    public static void main(String[] args) {

        System.out.println(SymbolOccurrence.findSymbolOccurrence("This is test string", 't'));

        WordPosition testWord = new WordPosition("This is test string", "str");
        System.out.println(testWord.findWordPosition());

        Reverse testReverse = new Reverse("Quotation");
        System.out.println(testReverse.stringReverse());

        Palindrome testPalindrome1 = new Palindrome("assa");
        System.out.println(testPalindrome1.isPalindrome());

        Palindrome testPalindrome2 = new Palindrome("source");
        System.out.println(testPalindrome2.isPalindrome());
    }
}