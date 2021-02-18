/*.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String*/
public class Ques10 {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public double mul(double num1, double num2) {
        return num1 * num2;
    }

    public String addString(String str1, String str2) {
        return str1 + str2;
    }

    public String addString(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }


    public static void main(String[] args) {
        Ques10 obj = new Ques10();
        System.out.println("Addition of two int : " + obj.add(5, 10));
        System.out.println("Addition of two double : " + obj.add(5.5, 10.5));
        System.out.println("multiplication of two int : " + obj.mul(5, 10));
        System.out.println("multiplication of two double : " + obj.mul(5.5, 10.0));
        System.out.println("Concatenation of two strings : " + obj.addString("hii ", "hello"));
        System.out.println("Concatenation of three strings : " + obj.addString("hii ", "hello ", "World"));
    }
}
