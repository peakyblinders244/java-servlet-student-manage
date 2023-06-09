package model.profile;

import entity.Course;
import entity.Student;

/**
 * Le-Hong-Quan
 * Date: 15/04/2023
 * Time: 21:35
 */
public class AddScoreProfile {
    private String id;
    private Student student;
    private Course course;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
