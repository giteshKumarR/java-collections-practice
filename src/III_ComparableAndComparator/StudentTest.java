package III_ComparableAndComparator;

import III_ComparableAndComparator.comparators.StudentGradeComparator;
import III_ComparableAndComparator.comparators.StudentHometownComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101,"Hitesh","A","Gurgaon"));
        students.add(new Student(102,"Shalini","C","Jalandhar"));
        students.add(new Student(103,"Garima","E","Sirsa"));
        students.add(new Student(106,"Karishma","D","Sirsa"));
        students.add(new Student(105,"Aman","C","Panipat"));
        students.add(new Student(107,"Logan","Bit co","Gurgaon"));
        students.add(new Student(108,"Kendell","A","Gurgaon"));

//        Collections.sort(students);
//        students.forEach((s) -> System.out.println("Student Name = " + s.getStudentName()));

        students.sort(new StudentGradeComparator());
        System.out.println("Grade Compare");
        students.forEach((s) -> {
            System.out.println("("+s.getStudentName()+ " , "+s.getGrade());
        });

        students.sort(new StudentHometownComparator());
        System.out.println("Hometown compare");
        students.forEach((s) -> {
            System.out.println("("+s.getStudentName()+ " , "+s.getHometown());
        });
        System.out.println();
        System.out.println();

        students.forEach((s) -> System.out.println("Student Name = " + s.getStudentName()));

    }
}
