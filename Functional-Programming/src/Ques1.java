/*
Q1 Write the following a functional interface and implement it using lambda:
        (1) First number is greater than second number or not          Parameter (int ,int ) Return boolean
        (2) Increment the number by 1 and return incremented value     Parameter (int) Return int
        (3) Concatenation of 2 string                                  Parameter (String , String ) Return (String)
        (4) Convert a string to uppercase and return .                 Parameter (String) Return (String)
*/


interface GreaterNumber {
    Boolean returnGreater(int a, int b);
}

interface Increment {
    int incrementNum(int a);
}

interface ConcatString {
    String concatString(String s1, String s2);
}

interface ToUppercaseString {
    String upperString(String s1);
}

class Ques1 {
    public static void main(String[] args) {

        GreaterNumber greaterNumber = (a, b) -> a > b;
        System.out.println("Is Greater number : " + greaterNumber.returnGreater(67, 70));

        Increment increment = (a) -> +a++;
        System.out.println("Incremented value : " + increment.incrementNum(999));

        ConcatString concatString = (s1, s2) -> s1 + " " + s2;
        System.out.println("Concatenated String : " + concatString.concatString("Hello", "TTN"));

        ToUppercaseString toUppercaseString = (s1) -> s1.toUpperCase();
        System.out.println("To uppercase : " + toUppercaseString.upperString("ttn"));

    }
}