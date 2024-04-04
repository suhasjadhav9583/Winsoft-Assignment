//Q3:Write a Java Program to count the number of words in a string using HashMap.

//solution:-
import java.util.HashMap;
public class Pr3 {
    public static void main(String[] args) {
        String inputString = "Hello world, this is a sample string with words.";
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = inputString.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            word = word.toLowerCase();
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
