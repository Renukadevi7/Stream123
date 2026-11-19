package functionalinterface.functionalInterface.BuildInInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainP {
    public static void main(String[] args) {
//        Predicate<Integer> p = (num) -> num%2==0;
//
////        {
////            return num%2==0;
////            if(num % 2 == 0){
////                return true;
////            }else{
////                return false;
////            }
////           };
//        System.out.println(p.test(15));
//        System.out.println(p.test(24));



//        Predicate<String> s = (name) -> name.isEmpty();

//        {
//            return name.isEmpty();
//            if(name.isEmpty()){
//                return true;
//            }else{
//                return false;
//            }
//        };

//        System.out.println(s.test("Johnny"));
//        System.out.println(s.test(""));
//
//
//        Function<String, Integer> f = (str) -> str.length();
//        System.out.println(f.apply("Joe"));
//
//        Function<Integer, Integer> n1 = (num1) -> num1*num1;
//        System.out.println(n1.apply(6));
//
//        Consumer<String> c = (name1) -> System.out.println("My name is " + name1);
//        c.accept("Maria");
//
//        Supplier<Integer> supplier = () -> {
//             return (int) Math.random();
//
//        };
//        System.out.println(supplier.get());
//
//        Supplier<String> str33 = () -> {
//            String x = "Shiva ";
//            String y = "Parvathy";
//            return x.concat(y);
//        };
//        System.out.println(str33.get());

        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.print(c.apply(1));
    }



}
