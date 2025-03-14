package III_ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101,"Hitesh","A","Gurgaon"));
        students.add(new Student(102,"Shalini","C","Jalandhar"));
        students.add(new Student(103,"Garima","D","Sirsa"));
        students.add(new Student(106,"Karishma","E","Sirsa"));
        students.add(new Student(105,"Aman","C","Panipat"));
        students.add(new Student(107,"Logan","A","Gurgaon"));
        students.add(new Student(108,"Kendell","A","Gurgaon"));

        Collections.sort(students);
        students.forEach((s) -> System.out.println("Student Name = " + s.getStudentName()));
    }
}
