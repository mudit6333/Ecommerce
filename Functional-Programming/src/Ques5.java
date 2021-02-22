/*
Q5 Implement following functional interfaces from java.util.function using lambdas:
    1.Consumer
    2.Supplier
    3.Predicate
    4.Function
 */


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Ques5 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        calculate(numbers);

    }

    private static void calculate(List<Integer> num) {
        Consumer<Integer> c= System.out::println;
        Supplier<Double> s= Math::random;
        Predicate<Integer>p=x->x%2==0;
        Function<Integer,Integer> f=x->x*x;



        System.out.println("Random number : "+ s.get());

        System.out.println("New List: ");
        num.stream().filter(p).map(f).forEach(c);
    }
}