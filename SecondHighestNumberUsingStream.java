import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumberUsingStream {
    public static void main(String[] args) {
//        int[] err = {1,2,4,2,9,1};
//
//       int re = Arrays.stream(err).distinct().boxed().sorted(Comparator.reverseOrder())
//                .skip(1).findFirst().orElseThrow();
//
//        System.out.println(re);


        int[] nums = {7, 3, 3, 8, 1, 1, 5};

       int ar = Arrays.stream(nums).distinct().boxed().sorted()
               .skip(1).findFirst().orElseThrow();

        System.out.println(ar);
    }
}
//Comparator.reverseOrder()