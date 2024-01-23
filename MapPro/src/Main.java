import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      InfoStudent studentMap = new InfoStudent();
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student you want to add :-");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++)
        {
        System.out.print("Enter the id : ");
        int stdid= sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter the name : ");
        String  name = sc.nextLine();
        System.out.print("Enter the grade : ");
        String grade  = sc.next();

        studentMap.addStudent(new Student(stdid,name,grade));
        }

        studentMap.viewStudent();

        studentMap.updateStudent();

        studentMap.deleteStdid();

        studentMap.searchbyid();

        studentMap.searchStudentsByGrade();

    }
}