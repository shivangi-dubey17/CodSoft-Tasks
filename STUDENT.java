package TASK5_STUDENT_COURSE_REGISTRATION_SYSTEM;

import java.util.ArrayList;

public class STUDENT {
    String studentId;
    String name;
    ArrayList<COURSES> registerCourses = new ArrayList<>();

    STUDENT(String studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }
}
