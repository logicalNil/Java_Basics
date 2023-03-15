public class RankofwordinDictonary {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String word = "f";
        int rank = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                rank = i + 1;
                break;
            }
        }
        System.out.println(rank);
    }
}
