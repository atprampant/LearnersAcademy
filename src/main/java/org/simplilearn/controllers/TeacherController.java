package org.simplilearn.controllers;

import org.simplilearn.entities.Teacher;
import org.simplilearn.services.SaveService;
import org.simplilearn.services.ShowLists;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/teacher")
public class TeacherController extends HttpServlet {
    ShowLists showlists=new ShowLists();

    SaveService service=new SaveService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Teacher> teachers=showlists.showTeachers();
        request.setAttribute("Teacher_List",teachers);
        RequestDispatcher rd=request.getRequestDispatcher("/listofteachers.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("tname");
        int age= Integer.parseInt(request.getParameter("tage"));
        service.createTeacher(name,age);
        RequestDispatcher rd=request.getRequestDispatcher("teacher.jsp");
        rd.forward(request,response);
    }
}
