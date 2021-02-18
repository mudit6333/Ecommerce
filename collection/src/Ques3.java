//Write a method that takes a string and print the number of occurrence of each character characters in the string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        HashMap<Character, Integer> hashmap = new HashMap<>();
        int value;
        for (int i = 0; i < str.length(); i++) {
            value = hashmap.getOrDefault(str.charAt(i), 0);
            /*if (hashmap.containsKey(str.charAt(i))) {
                value = hashmap.get(str.charAt(i));
            } else {
                value = 0;
            }*/
            hashmap.put(str.charAt(i), ++value);
        }

        for (Map.Entry<Character, Integer> hash : hashmap.entrySet()) {
            System.out.println(hash.getKey() + " : " + hash.getValue());
        }
    }
}