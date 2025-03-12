import java.util.*;

public class WordCounter {

    public static  HashMap <String, Integer> countWords(String chaine)
    {

        HashMap<String,Integer> wordCountMap = new HashMap<String,Integer>();
        String[] words = chaine.split("\\s+");
        for(String word : words)
        {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }


}

