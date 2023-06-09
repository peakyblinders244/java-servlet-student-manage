package controller.course;

import controller.BaseController;
import entity.Course;
import entity.Student;
import utils.DateUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 16:03
 */
@WebServlet(name = "CreateCourseController", value = "/courses-create")
public class CreateCourseController extends BaseController {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/courses/courses-create.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            resp.setCharacterEncoding("UTF-8");

            String name = req.getParameter("name");
            String courseCode = req.getParameter("courseCode");
            String lecture = req.getParameter("lecture");
            String yearSt = req.getParameter("year");
            String notes = req.getParameter("notes");

            Course course = new Course();
            course.setName(name);
            course.setCourseCode(courseCode);
            course.setLecture(lecture);
            course.setYear(DateUtils.convertDateToStringUTC(yearSt));
            course.setNotes(notes);

            courseService.createCourse(course);
            resp.sendRedirect(req.getContextPath() + "/courses");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
