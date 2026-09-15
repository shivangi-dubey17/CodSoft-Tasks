package TASK5_STUDENT_COURSE_REGISTRATION_SYSTEM;

import java.util.ArrayList;
import  java.util.Scanner;

public class STUDENT_COURSE_REGISTRATION {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        ArrayList<COURSES> Course = new ArrayList<>();

        Course.add(new COURSES(
            "JAVA101", 
            "JAVA PROGRAMMING",  
            "Learn Java programming",
            "Monday - 10:00 AM",
            30
     ));

        Course.add(new COURSES(
            "SQL102", 
            "SQL PROGRAMMING",
            "Learn SQL and database concepts",
            "Tuesday - 11:00 AM", 
            20
     ));

        Course.add(new COURSES(
        "HTML103",
        "HTML & CSS",
        "Learn web page design",
        "Wednesday - 12:00 PM",
        25
));

Course.add(new COURSES(
        "JS104",
        "JAVASCRIPT",
        "Learn JavaScript basics",
        "Thursday - 10:00 AM",
        30
));

Course.add(new COURSES(
        "PY105",
        "PYTHON PROGRAMMING",
        "Learn Python programming",
        "Friday - 11:00 AM",
        25
));

Course.add(new COURSES(
        "DB106",
        "DATABASE MANAGEMENT",
        "Learn database concepts",
        "Saturday - 10:00 AM",
        20
));

Course.add(new COURSES(
        "REACT107",
        "REACT JS",
        "Learn React and frontend development",
        "Saturday - 12:00 PM",
        30
));

        ArrayList<STUDENT> Students = new ArrayList<>();

        Students.add(new STUDENT("S101", "SHIVANGI"));
        Students.add(new  STUDENT("S102", "RAHUL"));

        System.out.println("STUDENT COURSE REGISTRATION");

        System.out.println("ENTER STUDENT ID");

        String id = sc.nextLine();
     
         STUDENT FoundStudent = null;

        for(int studentindex = 0; studentindex < Students.size(); studentindex++){
            STUDENT CurentStudent = Students.get(studentindex);
         
            if(CurentStudent.studentId .equalsIgnoreCase (id)){
             
                 FoundStudent = CurentStudent;
                 break;
            }
        }
               
            if(FoundStudent == null){
                System.out.println("STUDENT NOT FOUND");
                sc.close();
                return ;
            }


        System.out.println("\n WELCOME " + FoundStudent.name); 
        
      
       while (true) {
          System.out.println("\n AVAILABLE COURSES");

        for(int courseindex = 0; courseindex < Course.size();courseindex++){
            COURSES AvailableCourse = Course.get(courseindex);

            System.out.println(AvailableCourse.code + " - "+AvailableCourse.title+ " -"+ AvailableCourse.description + " - "+AvailableCourse.schedule + " - " +(AvailableCourse.capacity - AvailableCourse.enrolledStudents));
        }
        
        System.out.println("\n ENTER COURSE CODE");
        String inputecode = sc.nextLine();

        COURSES  SelectedCourse = null;
        
        for(int searchindex = 0; searchindex < Course.size(); searchindex++){
            COURSES courseItem = Course.get(searchindex);
        
            if(courseItem.code .equalsIgnoreCase (inputecode)){
                SelectedCourse = courseItem;
                break;
            }
        }
        if(SelectedCourse == null){
            System.out.println("COURSE NOT FOUND");

         } else if (FoundStudent.registerCourses
            .contains(SelectedCourse)) {

        System.out.println("COURSE ALREADY REGISTERED");

        }else if (SelectedCourse.enrolledStudents < SelectedCourse.capacity){
            FoundStudent.registerCourses.add(SelectedCourse);
            SelectedCourse.enrolledStudents++;

            System.out.println("COURSE REGISTERD SUCCESSFULLY");
        }else{
                 System.out.println("COURSE IS FULL");
        }

          System.out.println(
            "\nDO YOU WANT TO REGISTER ANOTHER COURSE? (yes/no)"
    );

    String answer = sc.nextLine();

    if (answer.equalsIgnoreCase("no")) {

        break;
    }
}
        System.out.println("\n REGISTERED COURSES");

        for(int registeredindex = 0; registeredindex < FoundStudent.registerCourses.size(); registeredindex++){

            COURSES registeredCourses = FoundStudent.registerCourses.get(registeredindex);

            System.out.println(
                registeredCourses.code + "-"+ registeredCourses.title
            );
        }
        
         System.out.println("\nDO YOU WANT TO DROP A COURSE? (yes/no)");

          String dropAnswer = sc.nextLine();

          if (dropAnswer.equalsIgnoreCase("yes")) {

        System.out.println("\n ENTER COURSE CODE TO DROP");
        String InputDropCode = sc.nextLine();

        COURSES CourseDrop = null;

        for(int dropIndex = 0; dropIndex < FoundStudent.registerCourses.size(); dropIndex++){
            COURSES CourseToCheck = FoundStudent.registerCourses.get(dropIndex);

            if(CourseToCheck.code.equalsIgnoreCase(InputDropCode)){
                CourseDrop = CourseToCheck;

                break;
            }
        }

        if(CourseDrop == null){
            System.out.println("COURSE NOT FOUND");
        }

        else{
            FoundStudent.registerCourses.remove(CourseDrop);
            CourseDrop.enrolledStudents--;

            System.out.println("COURSES DROP SUCCESSFULLY");

        }
 
           
    }

        sc.close();
    }
  }


