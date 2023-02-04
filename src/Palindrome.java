public class Palindrome {
    private final String source;


    public Palindrome(String source) {
        this.source = source;
    }

    boolean isPalindrome() {
        int n = source.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (source.charAt(i) != source.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

