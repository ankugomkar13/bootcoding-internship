import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InfoStudent
{
    HashMap<Integer,Student> std = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent(Student student)
    {
        System.out.println("Student added successfully");
        std.put(student.getStdid(), student);
    }


    public void viewStudent() {
        System.out.println("\nView the student list");
        for(Map.Entry me : std.entrySet())
        {
            System.out.println(me.getKey() +" "+me.getValue());
        }

    }


    public void updateStudent() {
        System.out.println("Enter the id");
        int stdid = sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter the grade : ");
        String grade = sc.next();
        if(std.containsKey(stdid))
        {
            Student student = std.get(stdid);
            student.setName(name);
            student.setGrade(grade);
            System.out.println(std);
        }
        else {
            System.out.println("Student id not found");
        }
        System.out.println("\nStudent updated successfully \n");


    }

    public void deleteStdid() {

        System.out.println("Enter the id");
        int id = sc.nextInt();
        std.remove(id);
        System.out.println("Student deleted successfully");
        System.out.println(std);

    }

    public void searchbyid()
    {
        System.out.println("Enter the id");
        int id = sc.nextInt();
        if (std.containsKey(id))
        {
            Student student = std.get(id);
            System.out.println(student);
        }
        else {
            System.out.println("Student not found");
        }
    }


    public List<Student> searchStudentsByGrade()
    {
        System.out.print("Enter the grade : ");
        String grade = sc.next();
        System.out.println(std.values().stream().filter(student -> student.getGrade().equalsIgnoreCase(grade))
                .collect(Collectors.toList()));

        return null;
    }


}
