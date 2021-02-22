/*Create a functional interface whose method takes 2 integers and return one integer.*/
interface FunctionalInterface {
    int sum(int num1, int num2);
}

public class Ques2 {
    public static void main(String args[]) {
        FunctionalInterface res = (x, y) -> (x + y);
        int result = res.sum(89, 91);
        System.out.println("Sum: " + result);
    }
}
