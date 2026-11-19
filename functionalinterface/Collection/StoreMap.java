package functionalinterface.Collection;

import java.util.HashMap;
import java.util.Map;

public class StoreMap {
    public static void main(String[] args) {

        int key ;
        int value;

        Map<Integer,Integer> st = new HashMap<>();
        st.put(1,12345);
        st.put(2,1234);

        System.out.println(st);
        System.out.println(st.get(2));
    }
}
