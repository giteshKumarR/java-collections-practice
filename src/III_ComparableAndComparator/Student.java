package III_ComparableAndComparator;

public class Student implements Comparable<Student>{
    private Integer studentId;
    private String studentName;
    private String grade;
    private String hometown;

    public Student() {
    }

    public Student(Integer studentId, String studentName, String grade, String hometown) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.hometown = hometown;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", grade='" + grade + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.getStudentName().compareToIgnoreCase(this.getStudentName());
    }
}
