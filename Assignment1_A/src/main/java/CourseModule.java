import java.util.ArrayList;

public class CourseModule {

    private String moduleName;
    private String moduleID;
    private ArrayList<Student> studentsEnrolled;
    private ArrayList<Course> associatedCourses;

    public CourseModule(String moduleName, String moduleID,
                        ArrayList<Student> studentsEnrolled,ArrayList<Course> associatedCourses ){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.studentsEnrolled = studentsEnrolled;
        this.associatedCourses = associatedCourses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public ArrayList<Course> getAssociatedCourses() {
        return associatedCourses;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void addStudent(Student s){
        studentsEnrolled.add(s);
    }
}
