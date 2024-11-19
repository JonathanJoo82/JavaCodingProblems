package Chapter1;

import java.io.CharConversionException;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter1Solutions {

    //count the given duplicates of characters in a given string
    public static void countDuplicateCharacters(String str){
        HashMap<Character, Integer> duplicatedCharactersMap = new HashMap<>();
        str.chars().forEach(ch -> {
            if(duplicatedCharactersMap.containsKey((char)ch)){
                int count = duplicatedCharactersMap.get((char)ch);
                count++;
                duplicatedCharactersMap.replace((char)ch, count);
            } else {
                duplicatedCharactersMap.put((char) ch, 1);
            }
        });
    }

    //uses the merge function to check if the previous value of the key is present if not present it will replace it with updated value count.
    public static void coPilotCountDuplicateCharacters(String str){
        HashMap<Character, Integer> duplicatedCharactersMap = new HashMap<>();
        str.chars().forEach(ch -> duplicatedCharactersMap.merge((char) ch, 1, Integer::sum));
    }

    //program that returns the first non-repeated character from a given string.
    public static void returnFirstNonRepeatedCharacter(String str){
        HashMap<Character, Integer> duplicatedCharactersMap = new HashMap<>();
        str.chars().forEach(ch -> duplicatedCharactersMap.merge((char) ch, 1, Integer::sum));

        List<Character> keysToRemoveList = duplicatedCharactersMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry :: getKey).collect(Collectors.toList());
        keysToRemoveList.forEach(duplicatedCharactersMap::remove);
        System.out.println(duplicatedCharactersMap);
    }
    //reverses the letter of each word and the word themselves.

}
