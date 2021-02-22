import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Ques10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 2, 3, 14, 5, 6, 17, 8);
        Double num = list.stream().mapToInt(x -> 2*x)
                                             .average().orElse(0.0);

        // OptionalDouble num = list.stream().mapToInt(x -> 2*x)
          //                                   .average();

        System.out.println(num);

    }
}