public class WordPosition {
    private final String source;
    private final String target;

    public WordPosition(String source, String target) {
        this.source = source;
        this.target = target;
    }

    public int findWordPosition() {
        return source.indexOf(target);
    }
}
