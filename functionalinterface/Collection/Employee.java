package functionalinterface.Collection;

//Using Java 8 Streams,
// find employees who have more than 7 years of experience and collect only their names into a List<String>


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private int id;
    private String name;
    private int yearsOfExperience;

    public Employee(int id, String name, int yearsOfExperience){
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Employee{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {

        List<Employee> em = new ArrayList<>();

        em.add(new Employee(1, "Joe", 5));
        em.add(new Employee(2, "James", 8));
        em.add (new Employee(3, "Mara", 10));
        em.add(new Employee(4, "David", 6));


        List<String> em1 = em.stream()
                .filter(e -> e.getYearsOfExperience() > 7)
                .map(Employee :: getName)
                .collect(Collectors.toList());

        System.out.println(em1);
        System.out.println(em.toString());
        System.out.println(em.hashCode());
        System.out.println(em.equals(em1));
    }

}
