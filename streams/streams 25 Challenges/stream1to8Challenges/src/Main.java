import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Main {

    record Emp(String name, String dept, double salary, String city) {}


    public static void main(String[] args) {

        List<Emp> emps = List.of(
                new Emp("Asha",  "IT",      85000, "Chicago"),
                new Emp("Bala",  "HR",      55000, "Dallas"),
                new Emp("Chen",  "IT",      95000, "Chicago"),
                new Emp("Divya", "HR",      70000, "Austin"),
                new Emp("Eric",  "Finance", 60000, "Dallas"));

        List<Integer> nums = List.of(5, 3, 8, 1, 8, 2, 9, 3);



        List<String> words = List.of("java", "stream", "api", "java",
                "lambda", "map", "stream");

        int[] arr = {4, 9, 2, 7};

        List<String> logs = List.of("ERROR Payment timeout", "INFO Order created",
                "ERROR Login failed", "ERROR Payment declined", "WARN Stock low");


      // Challenge 1: numbers greater than 4
      // write your code here
        List<Integer> result = nums.stream().filter(i -> i > 4).sorted().collect(toList());

           System.out.println(result);

      // Challenge 2: square every number → [25, 9, 64, 1, 64, 4, 81, 9]
      // Hint: you’re changing each item, so think about which method does that

      // as a List
        List<Integer> list = List.of(25, 9, 64, 1, 64, 4, 81, 9);

        List<Integer> squares = nums.stream()
                .map(s -> s * s)
                .toList();
        System.out.println(squares);


//       int[] - primitive datatype does not have stream() so use Arrays.stream().. Creates a stream from an array
//       boxed -Converts primitive int values into Integer objects
//        int[] sqnum = {25, 9, 64, 1, 64, 4, 81, 9};
////      as an array
// //       int[] arr = {25, 9, 64, 1, 64, 4, 81, 9};
//         List<Integer> squares = Arrays.stream(sqnum)
//                .map( s -> s * s)
//                .boxed()
//                .toList();
//
//        System.out.println(squares);


    // Challenge 3:Count the even numbers → 3
        // Its even numbers are 8, 8, 2, which is why the answer is 3
       //  Because Java Stream's count() method returns a long, not an int.
       //  Even if your result is just 3, its return type is still long
       //  List<Integer> nums = List.of(8, 5, 8, 3, 2);

     long evenCount = nums.stream()
                .filter(n -> n%2 == 0 )
                .count();
        System.out.println(evenCount);

   // Challenge 4: sum of all numbers in nums → 39
      // List<Integer> nums = List.of(5, 3, 8, 1, 8, 2, 9, 3);
//        Code review:
//
//        The sum variable isn’t needed. You can put 0 directly in reduce(0, ...).
//        (total, i) -> total + i can be shortened to Integer::sum.
//        Another common way: nums.stream().mapToInt(Integer::intValue).sum() returns an int directly.
//
//        *******MY WAY******
//        int sum = 0;
//       Integer result2 = nums.stream().reduce(0,(total, i) -> total + i);

/*
//###################################################################################################################
// 1. Your way, with 0 written directly in reduce
//       Integer result2 = nums.stream().reduce(0, (total, i) -> total + i);
//
//// 2. Same thing, using a method reference
//       Integer result3 = nums.stream().reduce(0, Integer::sum);
//
//// 3. Number stream: turn Integer into int, then sum()
//       int result4 = nums.stream().mapToInt(Integer::intValue).sum();
//
//System.out.println(result2);   // 39
//System.out.println(result3);   // 39
//System.out.println(result4);   // 39
**/
//###################################################################################################################

 // Challenge 4: sum of all numbers in nums → 39
        // List<Integer> nums = List.of(5, 3, 8, 1, 8, 2, 9, 3);
        Integer result2 = nums.stream().mapToInt(Integer::intValue).sum();

        System.out.println(result2);

//  Challenge 5: employee names in UPPERCASE → [ASHA, BALA, CHEN, DIVYA, ERIC]
       /* Challenge 5:

        Input: the emps list (the 5 Emp records)
        Task: make a new list with every employee’s name written in capital letters, then print it
       Expected output: [ASHA, BALA, CHEN, DIVYA, ERIC] **/

        List<String> emp =
              emps.stream().map((e -> e.name().toUpperCase())).toList();
          System.out.println(emp);


//  Challenge 6: remove duplicate numbers from nums → [5, 3, 8, 1, 2, 9]

        List<Integer> duplicate = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicate);

//  Challenge 7: sort nums from high to low → [9, 8, 8, 5, 3, 3, 2, 1]

        List<Integer> sort = nums.stream().sorted(Comparator.reverseOrder())
              .collect(Collectors.toList());
        System.out.println(sort);


//  Challenge 8: find the max value in arr (the int[]) → 9
//        int[] arr = {4, 9, 2, 7};

       int max = Arrays.stream(arr).max().orElseThrow();
        System.out.println(max);
    }

}