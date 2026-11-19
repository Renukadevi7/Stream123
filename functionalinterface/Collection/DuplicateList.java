//[10, 20]
package functionalinterface.Collection;


import java.util.List;
import java.util.stream.Collectors;


public class DuplicateList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 20, 40, 10, 50);


        List<Integer> count = numbers.stream()
                     .distinct()
                     .filter(n -> numbers.stream()
                                .filter(i -> i == n)
                                .count() > 1)
                     .collect(Collectors.toList());


        System.out.println(count);


//   ******Find Unique Duplicate Array*******************
//    ########### [10, 20, 30, 40, 50] #########
//       List<Integer> num = numbers.stream()
//                .distinct()
//                .filter(n -> n > 7)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(num);
    }

}
