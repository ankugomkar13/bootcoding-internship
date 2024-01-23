public interface StudentMap
{
    void addStudent(Student student);
    void viewStudent();
    void updateStudent(int stdid,String name,String grade);
    void deleteStd(int id);

}
