package model.search;

import model.search.base.BasePageAndSort;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 09:21
 */
public class ParameterSearchCourse extends BasePageAndSort {
    private String courseCode;
    private String courseName;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
