package functionalinterface.Collection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListOFUSStates {

//     public boolean add(){
//
//         return false;
//     }


    public static void main(String[] args) {
        List<String> states = new ArrayList<>();
        states.add("AL");
        states.add("NJ");
        states.add("TX");
        states.add("AZ");
        states.add("MN");
        states.add("NJ");


//    Object[] objectsArray = list.toArray(); DOES NOT Compile
        String[] strArray = states.toArray(new String[0]);

        System.out.println(states);
        System.out.println(strArray.length);



    }

}
