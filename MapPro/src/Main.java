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


        System.out.println("Enter 1 for view Student");
        System.out.println("Enter 2 for update Student");
        System.out.println("Enter 3 for delete Student");
        System.out.println("Enter 4 for Search Student by id");
        System.out.println("Enter 5 for Search Student by Grade");

        while(true)
        {
          System.out.println("\n\nEnter Your choice which operation you want ");
          int choice = sc.nextInt();

          switch (choice) {

            case 1:
              studentMap.viewStudent();
              break;
            case 2:
              studentMap.updateStudent();
              break;
            case 3:
              studentMap.deleteStdid();
              break;
            case 4:
              studentMap.searchbyid();
              break;
            case 5:
              studentMap.searchStudentsByGrade();
              break;
            default:
              System.out.println("Student Not exits");
          }

          }





    }
}