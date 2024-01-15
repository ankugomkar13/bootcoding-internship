import java.util.Scanner;

public class Student
{
    private int studentID;
    private String name;
    private String grade;
    private double GPA;

    public Student(int studentID, String name, String grade, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
        this.GPA = GPA;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", GPA=" + GPA +
                '}';
    }
}
