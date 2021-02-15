//assumption:twice aor Twice both are same

public class Ques2 {
    public static void main(String[] args) {

        String str = "Single twice Twice thrice ThRice thrice";

        String[] words = str.toLowerCase().split(" ");// first converted string into lower case then into array of words
        int count = 1;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != "#") {  //do not check for occurrence for same word again
                for (int j = i + 1; j < words.length; j++) {

                    if (words[i].equals(words[j])) {
                        count = count + 1;
                        words[j] = "#"; //replacing word with #
                    }
                }
                System.out.println(words[i] + "--" + count);
                count = 1;
            }

        }

    }
}
