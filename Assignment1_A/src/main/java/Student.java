import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private Course course;
    private ArrayList<CourseModule> modules;

    public Student(String name, int age, String DOB, int ID, Course course, ArrayList modules){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.username = getUsername();
        this.course = course;
        this.modules = modules;
    }

    public String getUsername() {
        name = name.replaceAll(" ", "");
        this.username = name+age;

        return username;
    }

    public Course getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<CourseModule> getModules() {
        return modules;
    }

    public String getDOB() {
        return DOB;
    }

    public String getName() {
        return name;
    }

}
