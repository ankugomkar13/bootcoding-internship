public interface StudentInfo
{
    void addStudent(Student student);
    void viewStudents();
    void updateStudent(int id, String newName, String newGrade,double GPA);
    void deleteStudent(int id);
    Student searchStudentByName(String name);
    void searchStudentByGrade(String grade);
    double calculateClassGPA();
    void sortStudentsByGPA(double minGPA, double maxGPA);

}
