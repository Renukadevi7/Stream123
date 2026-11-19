package functionalinterface.Collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesArray {


    public static void main(String[] args) {
        int[] number = {1,4,6,6,8,2};

        LinkedHashSet<Integer> remove = Arrays.stream(number)
                .boxed().collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(remove);


        List<?> q = List.of("Mouse","parrot");
        var v = List.of("Mouse","parrot");

        System.out.println(q);
        System.out.println(v);
//         q.removeIf(String::isEmpty); DOES NOT COMPILE
//         q.removeIf(s -> s.length() == 4); DOES NOT COMPILE
         v.removeIf(String::isEmpty);
         v.removeIf(s -> s.length() == 4);
    }
}
