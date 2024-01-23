import java.util.HashMap;
import java.util.Map;

public class StudentInfo implements StudentMap
{
    HashMap<Integer,Student> std = new HashMap<>();
    @Override
    public void addStudent(Student student)
    {
        System.out.println("Student added successfully");
        std.put(student.getStdid(), student);
    }
    @Override
    public void viewStudent()
    {
        System.out.println("View the student list");
        for(Map.Entry me : std.entrySet())
        {
            System.out.println(me.getKey() +" "+me.getValue());
        }
    }

    @Override
    public void updateStudent(int stdid, String name,String grade)
    {
        if(std.containsKey(stdid))
        {
            Student student = std.get(stdid);
            student.setName(name);
            student.setGrade(grade);

        }
        else {
            System.out.println("Student id not found");
        }
        System.out.println("Student updated successfully \n");

    }

    @Override
    public void deleteStd(int id)
    {
        std.remove(id);
        System.out.println("Student deleted successfully");
        System.out.println(std);
    }
}

