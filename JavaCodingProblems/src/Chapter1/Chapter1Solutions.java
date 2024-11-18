package Chapter1;

import java.io.CharConversionException;
import java.util.HashMap;

public class Chapter1Solutions {

    //count the given duplicates of characters in a given string
    public static void countDuplicateCharacters(String str){
        HashMap<Character, Integer> duplicatedCharactersMap = new HashMap<>();
        str.chars().forEach(ch -> {
            System.out.println((char) ch);
            if(duplicatedCharactersMap.containsKey((char)ch)){
                int count = duplicatedCharactersMap.get((char)ch);
                count++;
                duplicatedCharactersMap.replace((char)ch, count);
            } else {
                duplicatedCharactersMap.put((char) ch, 1);
            }
        });
    }
}
