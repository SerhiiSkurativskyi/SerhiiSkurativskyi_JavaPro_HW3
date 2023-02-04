public class Reverse {
    private final String source;


    public Reverse(String source) {
        this.source = source;

    }

    public String stringReverse() {
        char[] test1 = source.toCharArray();
        int size = test1.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = test1[i];
            test1[i] = test1[size - 1 - i];
            test1[size - 1 - i] = (char) temp;
        }

        return new String(test1);
    }


}
