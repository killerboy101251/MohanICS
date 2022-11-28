import java.util.Scanner;

class CourseDetails
{
    int course_Id;
    String name;
    double fee;

   CourseDetails(int course_Id,String  name,double fee)
  {
      this.course_Id =course_Id;
      this.name =name;
      this.fee =fee;

  }
  void operations(int course_Id, String course_name, double fee,  int course_id, String name)
    {
           if(course_Id==course_id || name.equals(course_name))
            {
               System.out.println(course_Id);
               System.out.println(name);
                System.out.println(fee);


            }

    }


}
public class Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("search for course details by entering id or name of the course");
        System.out.println("to Search by ID press:1 by name press:2");
        int x = sc.nextInt();
        int Course_id = 0;
        int id = 0;
       String name="";
        String course_name = "";
        switch (x) {
            case 1:
                System.out.println("enter the course_id");
                Course_id = sc.nextInt();
                break;
            case 2:
                System.out.println("enter the course_name");
                course_name = sc.next();
                break;
        }



        double fee = 0;

        CourseDetails[] arr = new CourseDetails[5];
        arr[0] = new CourseDetails(100, "Java", 1500);
        arr[1] = new CourseDetails(101, "python", 1100);
        arr[2] = new CourseDetails(102, ".net", 1200);
        arr[3] = new CourseDetails(103, "c", 1300);
        arr[4] = new CourseDetails(104, "c#", 1400);

        for(int i=0;i<5;i++) {
               arr[i].operations(id, course_name, fee, Course_id,name);

            }

        }
    }

