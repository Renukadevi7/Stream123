package functionalinterface.Collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlowerSet {



    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> backup = new HashSet<>(set);
        set.add("Lilly");
        set.add("Jasmine");
        set.add("Lilly");
        set.add("Hibiscus");
        set.remove("Jasmine");

//        set.isEmpty();
//        set.clear();

        set.addAll(backup);
        set.forEach(System.out::println);
        System.out.println(set.remove("Jasmine"));
//        System.out.println(set.stream().findAny().hashCode());
        System.out.println(set);
        System.out.println(set.size());

        //        ************** SET *****************
//        Set<Character> set = new HashSet<>();
//        set.add('z');
//        set.add('o');
//        set.add('o');
        Set<Character> letters = Set.of('z', 'o', 'i','o');
        Set<Character> copy = Set.copyOf(letters);

        System.out.println(copy);



    }
}
