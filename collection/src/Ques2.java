import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();

        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            hashSet.add(str.charAt(i));
        }

        System.out.println("Unique Character");
        Iterator<Character> itr = hashSet.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}