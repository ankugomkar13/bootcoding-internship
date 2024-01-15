import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        StudentInfo std = new StudentManagementSystem();


        // Add student
        std.addStudent(new Student(1, "Ankita Gomkar", "A-",12));
        std.addStudent(new Student(2, "Ranu Gomkar", "B",34));
        std.addStudent(new Student(3, "Ramesh", "B+",56));
        std.addStudent(new Student(4, "Suraj", "A+",67));

        // display students
        System.out.println("Students List:");
        std.viewStudents();

        // Update student's details
        std.updateStudent(2, "Robert", "A+",45);
        System.out.println("\nAfter updating Bob's details:");
        std.viewStudents();

        // Delete a student
        std.deleteStudent(1);
        System.out.println("\nAfter deleting Ankita Gomkar:");
        std.viewStudents();


        // Search for a student by name
        System.out.println("\nSearching for Ramesh:");
        Student foundStudent = std.searchStudentByName("Ramesh");
        System.out.println(foundStudent != null ? foundStudent : "Student not found.");



        //Search for a student by grade
        System.out.println("Student search by grade A- :");
        std.searchStudentByGrade("A-");

        //calculate avg GPA
        System.out.println("\nClass GPA: " + std.calculateClassGPA());


        System.out.println("\nSorting students by GPA (12-56):");
        std.sortStudentsByGPA(12, 56);


    }

    }
