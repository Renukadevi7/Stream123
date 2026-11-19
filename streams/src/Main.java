import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      List<String> names = List.of("Jess", "John","Jess","David");
        List<String> result= names.stream().distinct().map(String::toUpperCase).collect(Collectors.toList());


        System.out.println(result);
    }
}