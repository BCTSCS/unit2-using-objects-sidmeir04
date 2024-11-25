public class SongAnalyzer {
    private String lyrics;

    public SongAnalyzer(String lyr) {
        this.lyrics = lyr;
    }

    public void removeStopWords(String stopWords) {
        lyrics = removeString(lyrics, stopWords);
    }

    public String removeString(String text, String removed) {
        if (text == null || removed == null) {
            return text;
        }

        String[] words = text.split("\\s+");
        String result = "";

        for (String word : words) {
            if (!word.equals(removed)) {
                result += word + " ";
            }
        }

        return result.trim();
    }


    public String tokenize() {
        if (lyrics == null || lyrics.isEmpty()) {
            return "";
        }
        String[] words = lyrics.split("\\s+");
        return String.join("--", words);
    }

    public String getLyrics() {
        return lyrics;
    }
    
    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public static void main(String[] args) {
        SongAnalyzer analyzer = new SongAnalyzer("Hello world! This is a song, and this is fun.");
        analyzer.removeStopWords("is");
        System.out.println("After removing 'is': " + analyzer.getLyrics());
        String tokens = analyzer.tokenize();
        System.out.println("Tokenized lyrics: " + tokens);
    }
}
