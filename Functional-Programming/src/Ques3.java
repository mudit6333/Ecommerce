//Q3 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for the functional interface created.



interface FunctionalInterfaceQues3
{
    int apply(int a, int b);
}
public class Ques3
{
    public int add(int x, int y)
    {
        return x + y;
    }

    public int sub(int x, int y)
    {
        return x - y;
    }

    public static int mul(int x, int y)
    {
        return x * y;
    }

    public static void main(String[] args)
    {
        //instance method reference
        FunctionalInterfaceQues3 funInt1 = new Ques3()::add;
        System.out.println("Addition: "+ funInt1.apply(10,60));

        FunctionalInterfaceQues3 funcInt2 = new Ques3()::sub;
        System.out.println("Subtraction: "+ funcInt2.apply(10,60));

        //static method reference
        FunctionalInterfaceQues3 o3 = Ques3::mul;
        System.out.println("Multiplication: "+ o3.apply(10,60));
    }
}