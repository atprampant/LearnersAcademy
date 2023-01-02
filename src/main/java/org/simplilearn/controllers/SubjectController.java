package org.simplilearn.controllers;

import org.simplilearn.entities.Subject;
import org.simplilearn.services.SaveService;
import org.simplilearn.services.ShowLists;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/subject")
public class SubjectController extends HttpServlet {
    ShowLists showLists=new ShowLists();

    SaveService service=new SaveService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Subject> subjects=showLists.showSubjects();
        request.setAttribute("Subjects_List",subjects);
        RequestDispatcher rd=request.getRequestDispatcher("/listofsubjects.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String sid=request.getParameter("sid");
            String name=request.getParameter("sname");
            service.createSubject(sid,name);
            RequestDispatcher rd=request.getRequestDispatcher("subject.jsp");
            rd.forward(request,response);
    }
}
