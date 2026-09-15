package TASK5_STUDENT_COURSE_REGISTRATION_SYSTEM;

public class COURSES {
        
        String code;
        String title;
        String description;
        String schedule;
        int capacity;
        int enrolledStudents = 0;

        COURSES(String code, String title, String description,String schedule, int capacity)
        {
            this.code = code;
            this.title = title;
             this.description = description;
             this.schedule = schedule;
            this.capacity = capacity;
        }
    }

