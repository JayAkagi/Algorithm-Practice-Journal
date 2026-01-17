import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String wordOne = "saippuakivikauppias";
        String wordTwo = "A string to be reversed";
        String vowelCount = countVowels(wordTwo);

        System.out.println("[" + wordTwo + "] in reverse: " + reverseString(wordTwo) + "\n");
        System.out.println(wordOne + " is palindrome? : " + isPalindrome(wordOne) );
        System.out.printf("First repeating character in %s: %s\n", wordOne, firstRepeatingCharacter(wordOne));
        System.out.println(vowelCount);
    }

    public static String reverseString(String s){
        char[] characters = s.toCharArray();
        String reversed = "";

        char temp = 'x';
        for(int i = 0; i < characters.length / 2; i++){
            temp = characters[i];
            characters[i] = characters[characters.length - i - 1];
            characters[characters.length - i - 1] = temp;
        }

        for(char n : characters){
            reversed += n;
        }

        return reversed;        
    }

    public static boolean isPalindrome(String s){
        if(reverseString(s).toLowerCase().equals(s.toLowerCase())){
            return true;
        }

        return false;
    }

    public static String countVowels(String s){
        char[] vowels = {'a','e','i','o','u'};
        char[] characters = s.toCharArray(); 

        Map<Character, Integer> vowelCount = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            char c = characters[i];
            for (int j = 0; j < vowels.length; j++) {
                if(c == vowels[j])
                    vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            }
        }

        String msg = "";
        for(Map.Entry<Character, Integer> entry : vowelCount.entrySet()){
            char ch = entry.getKey();
            int value = entry.getValue();
            msg += String.format("%s count: %d\n", ch, value);
        }

        return msg;
    }

    public static Character firstRepeatingCharacter(String s){
        char[] characters = s.toCharArray();
        Character character = null;
        Integer indexPair = null;
        boolean foundPair = false;

        for (int i = 0; i < characters.length; i++) {
            Character toFind = characters[i];
            for (int j = i + 1; j < characters.length; j++) {
                if (toFind == characters[j]){
                    if(indexPair == null || j < indexPair){
                        indexPair = j;
                        character = toFind;
                    }
                    foundPair = true;
                }
            }
        }

        if(!foundPair) character = '-';
        return character;
    }
}
