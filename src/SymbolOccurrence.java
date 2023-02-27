public class SymbolOccurrence {
        public static int findSymbolOccurrence(String source, char target) {
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


