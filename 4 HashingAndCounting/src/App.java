import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(firstRepeatingElement("abcda"));
        System.out.println(firstNonRepeatingElement("aabbcdde"));
    }

    public static Character  firstRepeatingElement(String s){
        Set<Character> uniquCharacters = new HashSet<>();
        for(Character c : s.toCharArray()){
            if(uniquCharacters.contains(c)){
                return c;
            } else{
                uniquCharacters.add(c);
            } 
        }

        return null;
    }

    public static Character firstNonRepeatingElement(String s){
        Map<Character, Integer> characters = new HashMap<>();
        for(Character c : s.toCharArray()){
            characters.put(c, characters.getOrDefault(c,0) + 1);
        }

        Character letter = null;       
        for(Map.Entry<Character, Integer> entry : characters.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();

            if(value == 1) {
                return key;
            }
        }

        return letter;
    }
}
