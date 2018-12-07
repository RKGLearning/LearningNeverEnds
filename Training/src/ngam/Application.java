package ngam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Application {

    public static void main(String[] args)
    {
        String sample = "Mary had a little lamb its fleece was white "
                + "as snow And everywhere that Mary went the lamb was sure to go "
                + "It followed her to school one day which was against the rule It"
                + " made the children laugh and play to see a lamb at school And s"
                + "o the teacher turned it out but still it lingered near And waited "
                + "patiently about till Mary did appear Why does the lamb love Mary so the eage"
                + "r children cry Why Mary loves the lamb you know the teacher did reply";
        StringTokenizer st = new StringTokenizer(sample);
        List<String>    givenList = new ArrayList<String>();
        while(st.hasMoreElements())
        {
            givenList.add(st.nextToken());
        }

        /*
         *     generate (x,y) -> (...) map
         */
        Map<List<String>,List<String>> advMap = new HashMap<List<String>, List<String>>();
        String left1,left2,right = null;
        for(int listIndex = 0 ;listIndex < givenList.size() - 2; listIndex++)
        {
            left1 = givenList.get(listIndex);
            left2 = givenList.get(listIndex+1);
            right = givenList.get(listIndex+2);
            List<String> leftList = new ArrayList<String>();
            leftList.add(left1);
            leftList.add(left2);
            //if key already exist, thne update right to the value list
            if(advMap.containsKey(leftList))
            {
                advMap.get(leftList).add(right);
            }
            else
            {
                List<String> rightList = new ArrayList<String>();
                rightList.add(right);
                advMap.put(leftList, rightList);
            }
        }// end for

        System.out.println(advMap);

        //Ask user for length of word, he wants to generate. Here I am hard coding it
        //Also, ask for first 2 letter he wants to start with
        int lenghtOfWord = 2;
        String x1 = "the";
        String[] genArray = new String[lenghtOfWord];
        genArray[0] = x1;
        for(int genIndex=0; genIndex <lenghtOfWord-1 ; genIndex++)
        {
            List<String> leftKey = new ArrayList<String>();
            leftKey.add(genArray[genIndex]);
            leftKey.add(genArray[genIndex+1]);
            genArray[genIndex+1] = randomWord(advMap,leftKey);
        }
        System.out.println("Generated Word");
        for(int i=0;i<genArray.length;i++)
        {
            System.out.print(genArray[i]);
        }

    }// end main
    private  static String randomWord(Map<List<String>,List<String>> advMap, List<String> lKey)
    {
        if(advMap.containsKey(lKey))
        {
            List<String> lVal = advMap.get(lKey);
            int rndIndx = (int) (Math.random() * lVal.size() );
            return lVal.get(rndIndx);
        }
        else
        {    //here is am expecting user will enter initial 2 letter which have mapping in the given inital advMap
            return null;
        }
    }
}//end clas
