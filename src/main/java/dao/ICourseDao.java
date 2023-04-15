package dao;

import entity.Course;

import model.wrapper.ListWrapper;
import model.search.ParameterSearchCourse;

import java.sql.SQLException;
import java.util.List;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 07:53
 */
public interface ICourseDao {
    Course createCourse(Course course) throws SQLException, ClassNotFoundException;
    Course getById(Integer id) throws SQLException, ClassNotFoundException;
    Course getByCourseCode(String courseCode) throws SQLException, ClassNotFoundException;
    Course updateCourseById(Integer id, Course course) throws SQLException, ClassNotFoundException;
    List<Course> findAllByIds(List<Integer> ids) throws SQLException, ClassNotFoundException;
    void deleteCourseById(Integer id) throws SQLException, ClassNotFoundException;
    ListWrapper<Course> searchCourses(ParameterSearchCourse parameterSearchCourse) throws SQLException, ClassNotFoundException;
    Long countCourse(ParameterSearchCourse parameterSearchCourse) throws SQLException, ClassNotFoundException;
}
