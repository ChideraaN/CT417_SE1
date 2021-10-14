import java.security.PublicKey;
import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class Course {

    private String courseName;
    private ArrayList<CourseModule> associatedModules;
    private ArrayList<Student> studentsEnrolled;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName,ArrayList<CourseModule> associatedModules,ArrayList<Student> studentsEnrolled,
                  DateTime startDate, DateTime endDate){
        this.associatedModules = associatedModules;
        this.courseName = courseName;
        this.endDate = endDate;
        this.startDate = startDate;
        this.studentsEnrolled = studentsEnrolled;
    }

    public Course(){}

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public ArrayList<CourseModule> getAssociatedModules() {
        return associatedModules;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s){
        studentsEnrolled.add(s);
    }

    public void addModule(CourseModule cm){
        associatedModules.add(cm);
    }
}
