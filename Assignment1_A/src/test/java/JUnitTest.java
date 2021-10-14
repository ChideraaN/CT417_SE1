import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JUnitTest {
    public static void main (String args[]){

        JUnitTest test = new JUnitTest();
        test.studentTest();

    }

    @Test
    public void studentTest(){

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<CourseModule> modules = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<CourseModule> studentModules = new ArrayList<>();

        Course CSIT = new Course("CSIT",modules,students,DateTime.parse("2020-01-01") ,DateTime.parse("2020-09-01"));
        CourseModule programming = new CourseModule("Programming","CT111",students,courses);
        CourseModule systems = new CourseModule("Systems","CT112",students,courses);
        CourseModule networks = new CourseModule("Networks","CT113",students,courses);

        Student s = new Student("Chideraa Nnaemeka", 21, "20/07/2000", 18399741, CSIT, studentModules);

        students.add(s);
        modules.add(programming);
        modules.add(systems);
        modules.add(networks);
        studentModules.add((programming));
        studentModules.add(systems);
        courses.add(CSIT);

        Assert.assertEquals("CSIT",s.getCourse().getCourseName());
        Assert.assertEquals(s.getUsername(),"ChideraaNnaemeka21");

        String[] expectedModuleResults = {"Programming", "Systems"};
        String[] expectedCourseResults = {"CSIT"};

        for (int i = 0; i < studentModules.size(); i++){
            Assert.assertEquals(expectedModuleResults[i], studentModules.get(i).getModuleName());
        }

        for (int i = 0; i < courses.size(); i++){
            Assert.assertEquals(expectedCourseResults[i], courses.get(i).getCourseName());
        }

    }

}
