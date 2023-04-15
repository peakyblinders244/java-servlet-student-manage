package model.search;

import model.search.base.BasePageAndSort;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 08:41
 */
public class ParameterSearchStudent extends BasePageAndSort {
    private String studentCode;
    private String name;
    private String grade;

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
