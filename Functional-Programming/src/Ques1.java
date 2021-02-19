

interface CalculateFunction<T>
{
    boolean greater(int num1,int num2);
}
interface CalculateFunction2<T>
{
    String upperCase(String str);
}

public class Ques1 {
    public static void main(String[] args) {
        CalculateFunction func1=((num1, num2) -> num1>num2);
        CalculateFunction2 func2=(str -> str.toUpperCase());
        System.out.println(func1.greater(7,9));
        System.out.println(func2.upperCase("vinay"));
    }
}
