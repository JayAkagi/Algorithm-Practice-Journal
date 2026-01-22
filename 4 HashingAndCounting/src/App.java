import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("first repeating char: " + firstRepeatingElement("abcdaec"));
        System.out.println("first non repeating char: " + firstNonRepeatingElement("aabbcdde"));

        int[] a = {2,7,11,15,5,5,3};
        System.out.println(Arrays.toString(twoSumHashMap(a, 10)));
    }

    public static Character  firstRepeatingElement(String s){
        System.out.println("\nString: " + s);
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
        System.out.println("\nString: " + s);
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

    public static int[] twoSumHashMap(int[] a, int target){
        System.out.println("\nTwo Sum in HashMap");
        System.out.println(Arrays.toString(a));
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            int y = target - x;

            if(seen.containsKey(y)){
                System.out.println("Indeces: ");
                return new int[] {seen.get(y), i};
            }

            seen.put(x, i);
        }

        return null;
    }
}
