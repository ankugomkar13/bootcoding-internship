public class Main3 {
    public static void main(String[] args) {

        StudentManage std = new StudentManage();

        // Add student
        std.addStudent(new Student(1, "Ankita Gomkar", "A-", 12));
        std.addStudent(new Student(2, "Ranu Gomkar", "B", 34));
        std.addStudent(new Student(3, "Ramesh", "B+", 56));
        std.addStudent(new Student(4, "Suraj", "A+", 67));

        // display students
        System.out.println("Students List:");
        std.viewStudents();

        System.out.println("\nSearch by ID:");
        System.out.println(std.searchStudentById(2));

        System.out.println("\nSearching for Ramesh:");
        std.searchStudentsByName("Ramesh").forEach(System.out::println);

        System.out.println("\nSearch by Grade:");
        std.searchStudentsByGrade("A+").forEach(System.out::println);

        System.out.println("\nClass GPA: " + std.calculateClassGPA());

        System.out.println("\nStudents sorted by GPA:");
        std.sortStudentsByGPA().forEach(System.out::println);

        System.out.println("\nUpdating Student Information:");
        std.updateStudentInformation(1, "Rani", "B-");
        std.viewStudents();

        System.out.println("\nDeleting Student:");
        std.deleteStudent(2);
        std.viewStudents();

    }
}
