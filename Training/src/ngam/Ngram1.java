package ngam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
public class Ngram1
{

    private String words[]; // List of words in Supplied String
    private HashMap<String, List<String>> nGramsMap; // Mapping of the Ngrams
    private int value; // Value for NGram

    Ngram1(String text, int n)
    {
        if (text == null) throw new NullPointerException("Check the input parameters: String should not be null");
        if(n<1 || text.length()==0)  throw new IllegalArgumentException("Check the input parameters : String should not  empty and Ngram value should be > 1");

        words = text.split(" ");
        nGramsMap = new HashMap<String, List<String>>();
        this.value = n;
    }

    public Map<String, List<String>> generateNgrams()
    {
        // Filling the HashMap based on N value and using WOrds Array

        /*
         * Look at each set of N adjacent words in a document. Use the first N-1 words of the set as a key, and remember the fact that the nth word
         * followed that key. Once you’ve finished, you know the list of individual words that can follow each N-1 word sequence in the document.
         */
        for (int i = 0; i <= words.length - value; i++)
        {
            StringBuilder sb = new StringBuilder();
            int j = 0;

            while (j < value - 1)
            {
                sb.append(words[i + j].trim());
                j++;
                if (j < value - 1) sb.append(" ");
            }

            String key = sb.toString();

            if (!nGramsMap.containsKey(key))
            {

                ArrayList<String> list = new ArrayList<>();
                list.add(words[i + j]);
                nGramsMap.put(key, list);

            }
            else
            {
                List<String> list = nGramsMap.get(key);
                list.add(words[i + j]);
            }
            // System.out.println("Key:  "+key+"       Value :   "+words[i+j]);
        }
        return nGramsMap;
    }

    public String getNGramsText()
    {
        /*
         * To generate new text from this analysis, choose an arbitrary word pair as a starting point. Use these to look up a random next word (using
         * the table above) and append this new word to the text so far. This now gives you a new word pair at the end of the text, so look up a
         * potential next word based on these. Add this to the list, and so on.
         */
        if (nGramsMap.size() == 0) generateNgrams();
        StringBuilder result = new StringBuilder();
        Random gen = new Random();
        int st = gen.nextInt(words.length - value); // arbitrary word pair
        StringBuilder startSb = new StringBuilder();

        for (int i = 0; i < value - 1; i++)
        {
            startSb.append(words[st + i]);
            if (i + 1 < value - 1) startSb.append(" ");
        }

        String start = startSb.toString();

        result.append(start + " ");

        while (true)
        {

            int size = nGramsMap.get(start).size();
            String next;
            if (size > 1)
            {
                st = gen.nextInt(size - 1);
                next = nGramsMap.get(start).remove(st);
            }
            else
            {
                st = 0;
                next = nGramsMap.get(start).get(st);
            }

            String start_split[] = start.split(" ");
            String nextKey;
            if (start_split.length > 1)
            {
                nextKey = start.substring(start_split[0].length() + 1);
                start = nextKey + " " + next;
            }
            else start = next;

            result.append(next); // append this new word to the text so far

            if (nGramsMap.containsKey(start)) result.append(" ");
            else break;
        }
        return result.toString();
    }

    public static void main(String args[]) {
        System.out.println(new Ngram1("the",2).generateNgrams());
    }
}
