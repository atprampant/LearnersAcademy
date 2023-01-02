package org.simplilearn.controllers;

import org.simplilearn.entities.Student;
import org.simplilearn.services.SaveService;
import org.simplilearn.services.ShowLists;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/student")
public class StudentController extends HttpServlet {
    ShowLists showLists=new ShowLists();
    SaveService service=new SaveService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students= showLists.showStudents();
        request.setAttribute("Student_List",students);
        RequestDispatcher rd=request.getRequestDispatcher("/listofstudents.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            int rollno= Integer.parseInt(req.getParameter("rollno"));
            String name=req.getParameter("sname");
            service.createStudent(rollno,name);
            RequestDispatcher rd=req.getRequestDispatcher("student.jsp");
            rd.forward(req,resp);

    }

}
