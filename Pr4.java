// Q4:Write a Java Program to find the duplicate characters in a string.

//solution:-
import java.util.HashMap;
public class Pr4{
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        inputString = inputString.replaceAll("\\s+", "").toLowerCase();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Duplicate characters:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + ": " + charCountMap.get(c));
            }
        }
    }
}

