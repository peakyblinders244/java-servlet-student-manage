package dao;

import entity.Student;
import model.wrapper.ListWrapper;
import model.search.ParameterSearchStudent;

import java.sql.SQLException;
import java.util.List;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 07:52
 */
public interface IStudentDao {
    Student createStudent(Student student) throws SQLException, ClassNotFoundException;

    Student getById(Integer id) throws SQLException, ClassNotFoundException;

    Student getByStudentCode(String studentCode) throws SQLException, ClassNotFoundException;

    Student updateStudentById(Integer id, Student student) throws SQLException, ClassNotFoundException;

    void deleteStudentById(Integer id) throws SQLException, ClassNotFoundException;

    List<Student> findAllByIds(List<Integer> ids) throws SQLException, ClassNotFoundException;

    ListWrapper<Student> searchStudents(ParameterSearchStudent parameterSearchStudent) throws SQLException, ClassNotFoundException;

    Long countStudents(ParameterSearchStudent parameterSearchStudent) throws SQLException, ClassNotFoundException;

    List<Student> findAllStudentNotInStudentCourse(Integer courseId) throws SQLException, ClassNotFoundException;
}
