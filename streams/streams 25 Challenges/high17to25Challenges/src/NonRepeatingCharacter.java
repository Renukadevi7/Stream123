// "SWISS"

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String text = "swiss";

        Map<Character, Long> counts = text.chars()

                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c, LinkedHashMap::new, Collectors.counting()));


        Optional<Character> answer = text.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> counts.get(c) == 1)
                .findFirst();
        System.out.println(answer.orElse(null));



    }






}
