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

        Character[] ch = {'a','b','c','a','f','b','g','c'};
        System.out.println(frequencyCounting(ch));
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

        for(char c : s.toCharArray()){
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        for(char c : s.toCharArray()){
            if(characters.get(c) == 1){
                return c;
            }
        }

        return null;

        // ========= refactored ==========
        // for(Character c : s.toCharArray()){
        //     characters.put(c, characters.getOrDefault(c,0) + 1);
        // }
      
        // for(Map.Entry<Character, Integer> entry : characters.entrySet()){
        //     if(entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        // return null;
    }

    public static int[] twoSumHashMap(int[] a, int target){
        System.out.println("\nTwo Sum in HashMap");
        System.out.println(Arrays.toString(a));
        Map<Integer,Integer> seen = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            int y = target - x;

            if(seen.containsKey(y)){
                return new int[] {seen.get(y), i};
            }

            seen.put(x, i);
        }

        return null;
    }

    public static Map<Character, Integer> frequencyCounting(Character[] a){
        System.out.println("\nSimple counting values in hashmap");
        System.out.println(Arrays.toString(a));
        Map<Character, Integer> frequencyCount = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            frequencyCount.put(a[i], frequencyCount.getOrDefault(a[i], 0) + 1);
        }

        return frequencyCount;
    }
}
