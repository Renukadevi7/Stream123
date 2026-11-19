package comparablecomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main{
     public static void main(String[] args) {

         List<Student> list = new ArrayList<>(List.of(
                 new Student("Ravi", 82),
                 new Student("Anu", 90),
                 new Student("Meena", 75)));

         Collections.sort(list);
         System.out.println(list);

         List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));
         numbers.add(30);

         System.out.println(numbers);
     }
}
