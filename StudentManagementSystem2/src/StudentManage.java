import java.util.*;
import java.util.stream.Collectors;

public class StudentManage
{
    Map<Integer,Student> studentMap = new HashMap<>();

    //addiing a new student
    public void addStudent(Student student) {
        studentMap.put(student.getStudentID(), student);
    }

    // View method for view the list of all student
    public void viewStudents() {
        for (Student student : studentMap.values()) {
            System.out.println(student.toString());
        }
    }

    // Update a student's details
    public void updateStudentInformation(int studentID, String newName, String newGrade) {
        if (studentMap.containsKey(studentID)) {
            Student student = studentMap.get(studentID);
            student.setName(newName);
            student.setGrade(newGrade);
        } else {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    //// Delete a student by ID
    public void deleteStudent(int studentID) {
        studentMap.remove(studentID);
    }

    //Search student by id
    public Student searchStudentById(int studentID) {
        return studentMap.get(studentID);
    }

    //search student by name
    public List<Student> searchStudentsByName(String name) {
        return studentMap.values().stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    // search student by its grade
    public List<Student> searchStudentsByGrade(String grade) {
        return studentMap.values().stream()
                .filter(student -> student.getGrade().equalsIgnoreCase(grade))
                .collect(Collectors.toList());
    }

    //Avg of GPA
    public double calculateClassGPA() {
        return studentMap.values().stream().mapToDouble(Student::getGPA).average().orElse(0.0);
    }

    //sort the std by its GPA
    public List<Student> sortStudentsByGPA() {
        return studentMap.values().stream()
                .sorted((std1, std2) -> Double.compare(std2.getGPA(), std1.getGPA()))
                .collect(Collectors.toList());
    }
}

