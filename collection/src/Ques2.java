//Write a method that takes a string and returns the number of unique characters in the string.


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ques2 {

    static int uniqueCharacterCount(String str) {
        int count = 0;
        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            hashSet.add(str.charAt(i));
        }
        Iterator<Character> itr = hashSet.iterator();

        while (itr.hasNext()) {
            count++;
            itr.next();
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        System.out.println("unique character count : " + uniqueCharacterCount(str));


    }
}