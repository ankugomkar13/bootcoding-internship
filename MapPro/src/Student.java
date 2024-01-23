import java.util.Scanner;

public class Student
{
    private int stdid;
    private String name;
    private String grade;

    Scanner sc = new Scanner(System.in);
    public Student(int stdid, String name, String grade) {
        this.stdid = stdid;
        this.name = name;
        this.grade = grade;
    }

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
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

    @Override
    public String toString() {
        return "Student{" +
                "stdid=" + stdid +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
