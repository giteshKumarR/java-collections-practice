package III_ComparableAndComparator.comparators;

import III_ComparableAndComparator.Student;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGrade().compareToIgnoreCase(o2.getGrade());
    }
}
