import java.util.*;

public class Alpaca {


    Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
    static Comparator<Integer> c2 = Comparator.naturalOrder();
    static Comparator<Integer> c3 = Comparator.reverseOrder();

    public static void main(String[] args) {

        var list = Arrays.asList(5, 4, 7, 2);
        Collections.sort(list,c2);
        Collections.reverse(list);
        Collections.reverse(list);
        System.out.println(Collections.binarySearch(list, 2));

    }


// list set
//    public static void main(String[] args) {
//        var list = List.of(1, 2, 3);
//        var set = Set.of(1, 2, 3);
//        var map = Map.of(1, 2, 3, 4);
//        .forEach(System.out.println());
    }

//}

//    public List<String> hairy(List<String> list) { return null; }


//[85,55] [55,88]
//public Record Sorted(int num, String text)
//     implements Comparable<Sorted>, Comparator<Sorted> {
//
//    public String toString() { return "" + num; }
//    public int compareTo(Sorted s) {
//        return text.compareTo(s.text);
//    }
//    public int compare(Sorted s1, Sorted s2) {
//        return s1.num - s2.num;
//    }
//    public static void main(String[] args) {
//        var s1 = new Sorted(88, "a");
//        var s2 = new Sorted(55, "b");
//        var t1 = new TreeSet<Sorted>();
//        t1.add(s1); t1.add(s2);
//        var t2 = new TreeSet<Sorted>(s1);
//        t2.add(s1); t2.add(s2);
//        System.out.println(t1 + " " + t2);
//    } }