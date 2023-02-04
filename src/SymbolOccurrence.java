public class SymbolOccurrence {
    private final String source;
    private final char target;

    public SymbolOccurrence(String source, char target) {
        this.source = source;
        this.target = target;
    }

    public int findSymbolOccurrence() {
        char[] test1 = source.toCharArray();
        int findSymbolOccurrence = 0;
        for (char c : test1) {
            if (c == target) {
                findSymbolOccurrence++;
            }
        }
        return findSymbolOccurrence;

    }
}


