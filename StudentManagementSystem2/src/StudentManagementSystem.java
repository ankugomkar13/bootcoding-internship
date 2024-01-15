import java.util.*;
 public class StudentManagementSystem implements StudentInfo {
     List<Student> studentslist = new ArrayList<>();

     // Add method for adding a student
     public void addStudent(Student student) {
         studentslist.add(student);
     }

     // View method for view the list of all student
     public void viewStudents() {
         for (Student student : studentslist) {
             System.out.println(student.toString());
         }
     }

     // Update a student's details
     public void updateStudent(int id, String newName, String newGrade, double GPA) {
         for (Student std : studentslist) {
             if (std.getStudentID() == id) {
                 std.setName(newName);
                 std.setName(newName);
                 std.setGrade(newGrade);
                 break;
             }
         }
     }

     // Delete a student by ID
     public void deleteStudent(int id) {
         studentslist.removeIf(std -> std.getStudentID() == id);
     }

     // search student by name
     public Student searchStudentByName(String name) {
         for (Student std : studentslist) {
             if (std.getName().equalsIgnoreCase(name)) {
                 return std;
             }
         }return null;}

     // Search student by grade
     public void searchStudentByGrade(String grade) {
         for (Student std : studentslist) {
             if (std.getGrade() == grade) {
                 System.out.println(std);
             }
         }
     }

     //calculate the avg of GPA
     public double calculateClassGPA() {
         double totalGpa = 0;
         for (Student std : studentslist)
         {
             totalGpa += std.getGPA();
         }
         return totalGpa;
     }

 //sort the student by its GPA
     public void sortStudentsByGPA(double minGPA, double maxGPA) {
         for (Student std : studentslist) {
             if (std.getGPA() >= minGPA && std.getGPA() <= maxGPA) {
                 System.out.println(std);
             }
         }

     }

 }


