package org.simplilearn.controllers;

import org.simplilearn.services.SetService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/setsubject")
public class SetSubject extends HttpServlet {

    SetService service=new SetService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int cid=Integer.parseInt(request.getParameter("cid"));
            String subid=request.getParameter("subid");
            service.setSubject(cid,subid);
            RequestDispatcher rd=request.getRequestDispatcher("class.jsp");
            rd.forward(request,response);

    }
}
