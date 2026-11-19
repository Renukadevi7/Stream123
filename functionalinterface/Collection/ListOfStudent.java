package functionalinterface.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudent {

    public static void main(String[] args) {
        List<String> sl = new ArrayList<>();
        sl.add("Ram");
        sl.add("Somu");
        sl.add("Raja");
        sl.add("Sweety");
        sl.add("Raja");
        sl.add("Ram");
        sl.remove("Raja");

        System.out.println(sl);
        System.out.println(sl.size());
        System.out.println(sl.contains("R"));
        System.out.println(sl.contains("Ram"));

    }
}
