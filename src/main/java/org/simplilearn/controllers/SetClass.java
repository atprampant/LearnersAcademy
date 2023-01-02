package org.simplilearn.controllers;

import org.simplilearn.services.SetService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/setclass")
public class SetClass extends HttpServlet {

    SetService service=new SetService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int rollno= Integer.parseInt(request.getParameter("rollno"));
            int cid=Integer.parseInt(request.getParameter("cid"));
            service.setClass(rollno,cid);
            RequestDispatcher rd=request.getRequestDispatcher("student.jsp");
            rd.forward(request,response);
    }
}
