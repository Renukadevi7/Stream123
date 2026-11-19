import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


public class Main {

    private static final String NONE = "NONE";

    record Emp(String name, String dept, double salary, String city) {}


    public static void main(String[] args) {

        List<Emp> emps = List.of(
                new Emp("Asha", "IT", 85000, "Chicago"),
                new Emp("Bala", "HR", 55000, "Dallas"),
                new Emp("Chen", "IT", 95000, "Chicago"),
                new Emp("Divya", "HR", 70000, "Austin"),
                new Emp("Eric", "Finance", 60000, "Dallas"));

        List<Integer> nums = List.of(5, 3, 8, 1, 8, 2, 9, 3);

        List<String> words = List.of("java", "stream", "api", "java",
                "lambda", "map", "stream");

        int[] arr = {4, 9, 2, 7};

        List<String> logs = List.of("ERROR Payment timeout", "INFO Order created",
                "ERROR Login failed", "ERROR Payment declined", "WARN Stock low");


//   Challenge 9: names of the IT employees, sorted A–Z → [Asha, Chen]

        List<String> result = emps.stream().filter(e -> "IT".equals(e.dept())).map(Emp::name).sorted().toList();
        System.out.println(result);

//   Challenge 10: average salary of all employees → 73000.0
//        Input: the salaries of all 5 employees in emps (85000, 55000, 95000, 70000, 60000)
//        Task: average = add them all up, then divide by how many there are
//        Expected output: 73000.0, a single double value, not a list


        double avg = emps.stream()
                .mapToDouble(Emp::salary)   // Emp -> double (DoubleStream)
                .average()                  // OptionalDouble[73000.0]
                .orElse(0);      // take the value, or 0 if the list is empty

        System.out.println(avg);        // 73000.0

//  Challenge 11: the first word starting with “l”, or “NONE” if there isn’t one → lambda
//        Input: words
//        Task: find the first word that starts with the letter “l”. If no word starts with “l”, the result should be "NONE".
//        Expected output: lambda

        String fWords = words.stream().filter(s -> s.startsWith("l")).findFirst().orElse(NONE);

        System.out.println(fWords);

//   Challenge 12: all employee names joined with " | " → Asha | Bala | Chen | Divya | Eric

        String join = emps.stream().map(Emp::name).collect(Collectors.joining(" | "));
        System.out.println(join);

//    Challenge 13: is any employee in Austin? → true


//       String p = String.valueOf(emps.stream().map(Emp::city).filter(e -> e.contains("Austin")).findFirst().isPresent());
        boolean p = emps.stream().anyMatch(e -> "Austin".equals(e.city()));
        System.out.println(p);   // true

//  Challenge 14: count how many times each word appears in words, with the keys sorted → {api=1, java=2, lambda=1, map=1, stream=2}

        Map<String, Long> co = words.stream().collect(Collectors.groupingBy(
                w -> w,
                TreeMap::new,
                Collectors.counting()));


        System.out.println(co);

//  Challenge 15: names of the top 2 highest paid → [Chen, Asha]

//        source  →  filter  →  sorted  →  limit  →  map  →  last step
//          (which)    (order)   (how many) (shape)   (result)

        List<String> highestPay =  emps.stream().sorted(Comparator.comparingDouble(Emp::salary)
                .reversed()).limit(2).map(Emp::name).toList();
        System.out.println(highestPay);

// Challenge 16: second-highest distinct number in nums → 8
//    List<Integer> nums = List.of(5, 3, 8, 1, 8, 2, 9, 3);
      int secondHighest = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(-1);

        System.out.println(secondHighest);

//   Challenge 17: convert arr to a sorted List<Integer> → [2, 4, 7, 9]


//        int[] arr = {4, 9, 2, 7};

        List<Integer> arr4 = Arrays.stream(arr).sorted().boxed().toList();

        System.out.println(arr4);

    }
}