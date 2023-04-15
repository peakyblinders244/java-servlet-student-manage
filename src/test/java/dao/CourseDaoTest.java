package dao;

import dao.impl.CourseDao;
import entity.Course;
import model.wrapper.ListWrapper;
import model.search.ParameterSearchCourse;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 09:40
 */
public class CourseDaoTest {
    private CourseDao courseDao = new CourseDao();

    @Test
    public void searchCourse() throws SQLException, ClassNotFoundException {
        ParameterSearchCourse parameterSearchCourse = new ParameterSearchCourse();
        ListWrapper<Course> listWrapper = courseDao.searchCourses(parameterSearchCourse);
        int n = 0;
    }

    @Test
    public void createCourse() throws SQLException, ClassNotFoundException {
        Course course = new Course();
        course.setCourseCode("C005");
        course.setName("Java");
        course.setLecture("Le Hong Quan");
        course.setYear(new java.util.Date());
        course.setNotes("Java");
        Course courseCreate = courseDao.createCourse(course);
        int n = 0;
    }

    @Test
    public void updateCourse() throws SQLException, ClassNotFoundException {
        Course course = new Course();

        course.setCourseCode("C005");
        course.setName("Java");
        course.setLecture("Le Hong Quan 1");
        course.setYear(new java.util.Date());
        course.setNotes("Java");
        Course courseCreate = courseDao.updateCourseById(5, course);
        int n = 0;
    }
}
