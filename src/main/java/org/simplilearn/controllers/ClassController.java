package org.simplilearn.controllers;

import org.simplilearn.entities.EClass;
import org.simplilearn.services.SaveService;
import org.simplilearn.services.ShowLists;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/class")
public class ClassController extends HttpServlet {
    ShowLists showlists=new ShowLists();

    SaveService service=new SaveService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<EClass> classes=showlists.showClasses();
        request.setAttribute("Classes_List",classes);
        RequestDispatcher rd=request.getRequestDispatcher("/listofclasses.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String name=request.getParameter("cname");
            service.createClass(name);
            RequestDispatcher rd=request.getRequestDispatcher("class.jsp");
            rd.forward(request,response);
    }
}
