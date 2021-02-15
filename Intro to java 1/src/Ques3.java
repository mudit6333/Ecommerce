public class Ques3 {
    public static void main(String[] args) {
        String str = "think twice code once";
        int count = str.length() - str.replace("e", "").length();
        System.out.println("Number of occurrences of 'e'   = "+count);
    }
}
