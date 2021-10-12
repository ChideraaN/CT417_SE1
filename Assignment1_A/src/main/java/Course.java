import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {

    private String courseName;
    private ArrayList<CourseModule> associatedModules;
    private ArrayList<Student> studentsEnrolled;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String courseName,ArrayList<CourseModule> associatedModules,ArrayList<Student> studentsEnrolled,
                  LocalDate startDate, LocalDate endDate){
        this.associatedModules = associatedModules;
        this.courseName = courseName;
        this.endDate = endDate;
        this.startDate = startDate;
        this.studentsEnrolled = studentsEnrolled;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public ArrayList<CourseModule> getAssociatedModules() {
        return associatedModules;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getStartDate() {
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
