//int[] arr = {12, 35, 1, 10, 34, 1};
//34


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

          Optional<Integer> result = Arrays.stream(arr).distinct()
                     .boxed()
                     .sorted(Comparator.reverseOrder())
                     .skip(1)
                     .findFirst();


        System.out.println(result);
    }


}
