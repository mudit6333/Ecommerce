//Write a program to find the number of occurrences of a character in a string without using loop?
public class Ques3 {
    public static void main(String[] args) {
        String str = "think twice code once";
        int count = str.length() - str.replace("e", "").length();
        System.out.println("Number of occurrences of 'e'   = "+count);
    }
}
