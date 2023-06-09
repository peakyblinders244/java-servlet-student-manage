package service;

import entity.Student;
import model.wrapper.ListWrapper;
import model.search.ParameterSearchStudent;

import java.sql.SQLException;
import java.util.List;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 10:03
 */
public interface IStudentService {
    Student getById(Integer id) throws SQLException, ClassNotFoundException;

    Student createStudent(Student student) throws SQLException, ClassNotFoundException;

    Student updateStudentById(Integer id, Student student) throws SQLException, ClassNotFoundException;

    void deleteStudentById(Integer id) throws SQLException, ClassNotFoundException;

    ListWrapper<Student> searchStudents(ParameterSearchStudent parameterSearchStudent) throws SQLException, ClassNotFoundException;

    List<Student> findAllStudentNotInStudentCourse(Integer courseId) throws SQLException, ClassNotFoundException;
}
