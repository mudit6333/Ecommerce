public class Ques4 {
    public static void main(String[] args) {
        String str = " #My phone number is 7053572542 my id is Vinay.Singh@gmail.com #";
        int totalChars = str.length();
        int upperCase = 0, lowerCase = 0, digits = 0, others = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }

        double upperCasePercentage = (upperCase * 100.0) / totalChars;

        double lowerCasePercentage = (lowerCase * 100.0) / totalChars;

        double digitsPercentage = (digits * 100.0) / totalChars;

        double otherCharPercentage = (others * 100.0) / totalChars;
        System.out.println("total characters "+totalChars);
        System.out.println("Number of uppercase letters are " + upperCase + " so percentage is :" + upperCasePercentage + "% ");

        System.out.println("Number of lowercase letters are " + lowerCase + " so percentage is :" + lowerCasePercentage + "%");

        System.out.println("Number of digits Are " + digits + " so percentage is :" + digitsPercentage + "%");

        System.out.println("Number of other Characters Are " + others + " so percentage is :" + otherCharPercentage + "%");

    }
}
