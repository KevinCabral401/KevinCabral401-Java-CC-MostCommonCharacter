import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        Character maxCharacter = null;
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
        }
    
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            
            if (value > maxCount) {
                maxCount = value;
                maxCharacter = key;
            }
        }
    
        return maxCharacter;
    }
    
}
