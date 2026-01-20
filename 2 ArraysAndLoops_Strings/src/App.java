import java.util.HashMap;
import java.util.HashSet;
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
        if(s == null) return null;

        char[] characters = s.toCharArray();

        for(int i = 0; i < characters.length / 2; i++){
            char temp = characters[i];
            characters[i] = characters[characters.length - i - 1];
            characters[characters.length - i - 1] = temp;
        }


        return new String(characters);        
    }

    public static boolean isPalindrome(String s){
        if(s == null ) return false;

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left ++;
            right --;
        }

        return true;
    }

    public static String countVowels(String s){
        if (s == null) return null;
        char[] characters = s.toLowerCase().toCharArray(); 

        Map<Character, Integer> vowelCount = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            char c = characters[i];
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u'){
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : vowelCount.entrySet()){
            stringBuilder.append(entry.getKey())
            .append(" count: ")
            .append(entry.getValue())
            .append("\n");
        }

        return stringBuilder.toString();
    }

    public static Character firstRepeatingCharacter(String s){
        if(s == null) return null;

        HashSet<Character> seen = new HashSet<>();
        for(char c : s.toCharArray()){
            if(seen.contains(c)) return c;
            seen.add(c);
        }

        return null;
    }
}
