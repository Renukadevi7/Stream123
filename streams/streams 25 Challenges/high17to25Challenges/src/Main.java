//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Main {

    record Emp(String name, String dept, double salary, String city) {
    }


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


//  Challenge 18: employee names grouped by dept, keys sorted → {Finance=[Eric], HR=[Bala, Divya], IT=[Asha, Chen]}


        Map<String, List<String>> empStringMap = emps.stream().collect(Collectors.groupingBy(
                Emp::dept,
                TreeMap::new,
                Collectors.mapping(Emp::name, Collectors.toList())));

        System.out.println(empStringMap);


// Challenge 19: total salary per city, keys sorted → {Austin=70000.0, Chicago=180000.0, Dallas=115000.0}

        TreeMap<String, Double> salary  = emps.stream().collect(Collectors.groupingBy(
                Emp::city,
                TreeMap::new,
                Collectors.summingDouble(Emp::salary)));

        System.out.println(salary);

// / Challenge 20: split nums into even and odd → {false=[5, 3, 1, 9, 3], true=[8, 8, 2]}

        Map<Boolean, List<Integer>> evenOdd = nums.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(evenOdd);
     }
  }