import java.util.*;
public class Course
{
    public String name;
    public int testscore;
    public String course;
    public int LIMIT = 5;
    public String newCourse;
    ArrayList<String> arr = new ArrayList<String>();

    public Course()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter course name: ");
        course = scan.nextLine();
    }
    
    //add a student method
    public void addStudent() 
    {
       Scanner scan = new Scanner(System.in);      
       System.out.println("Enter name ");
       name = scan.nextLine();
       System.out.println("Enter test score ");
       testscore = scan.nextInt();
       Student student = new Student(testscore, name);
       
       arr.add(Student);
    }
 
    //print all of the students   
    public void roll()
        {
            System.out.println(course + " Class List:");

            for (int index = 0; index < arr.size(); index++){
                System.out.println(arr.get(index) + " ");
                System.out.println();
            }
        }
    
}
