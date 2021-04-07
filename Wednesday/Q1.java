//find and replace pattern
import java.util.*;
public class Q1 {

    public static void main(String[] args) {

        String strList[] =  new String[]{"abc","eee","deq","ijk","mee","aqq","dkd","ddd","ccc"};
        String pattern = "aaa";
        Q1 matchedList = new Q1();
        System.out.println(matchedList.replaceMethod(strList, pattern));
    }
        public ArrayList<String> replaceMethod(String[] stringList, String pattern)
        {
            StringBuilder patternPermutation = new StringBuilder();
            char patternArray[] = pattern.toCharArray();
            int index = 0;
            ArrayList<String> matchedpatternList = new ArrayList();

            Map<Character, Integer> matchingList = new HashMap<>();

            for(int i=0;i<patternArray.length;i++)
            {
                if(matchingList.get(patternArray[i])==null)
                {
                    index++;
                    matchingList.put(patternArray[i], index);
                    patternPermutation.append(index);
                }
                else
                {
                    patternPermutation.append(matchingList.get(patternArray[i]));
                }
            }


            for(String word: stringList)
            {
                if(word.length()!=pattern.length())
                continue;
                matchingList.clear();

                char wordcharArray[] =  word.toCharArray();
                boolean matched = true;
                StringBuilder wordPermutation = new StringBuilder();
                index = 0;
                for(int i=0;i<wordcharArray.length;i++)
            {
                if(matchingList.get(wordcharArray[i])==null)
                {
                    index++;
                    matchingList.put(wordcharArray[i], index);
                    wordPermutation.append(index);
                }
                else
                {
                    wordPermutation.append(matchingList.get(wordcharArray[i]));
                }
               if(patternPermutation.charAt(i)!=wordPermutation.charAt(i))
               {matched = false;
                   break;
               }
            }
            if(matched)
            {
                matchedpatternList.add(word);
            }

            }
            return matchedpatternList;


        }
    
}
