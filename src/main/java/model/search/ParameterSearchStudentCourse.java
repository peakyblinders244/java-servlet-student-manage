package model.search;

import model.search.base.BasePageAndSort;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 09:47
 */
public class ParameterSearchStudentCourse extends BasePageAndSort {
    private Integer studentId;
    private Integer courseId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}
