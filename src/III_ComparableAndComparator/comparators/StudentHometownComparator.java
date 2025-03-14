package III_ComparableAndComparator.comparators;

import III_ComparableAndComparator.Student;

import java.util.Comparator;

public class StudentHometownComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getHometown().compareToIgnoreCase(o1.getHometown());
    }
}
