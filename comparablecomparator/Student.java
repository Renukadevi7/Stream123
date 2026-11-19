package comparablecomparator;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {

    private String stName;
    private int marks;

    public Student(String stName, int marks) {
        this.stName = stName;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);

    }

    @Override
    public String toString(){
        return stName + "=" + marks;
    }
}

