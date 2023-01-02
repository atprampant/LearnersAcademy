package org.simplilearn.controllers;

import com.mysql.cj.protocol.x.Notice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.simplilearn.config.HibConfig;
import org.simplilearn.entities.Subject;
import org.simplilearn.entities.Teacher;
import org.simplilearn.services.SetService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/setteacher")
public class SetTeacher extends HttpServlet {
    SetService service=new SetService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String subid=request.getParameter("subid");
                int tid= Integer.parseInt(request.getParameter("tid"));
//                request.setAttribute("Subject",subject);
//                request.setAttribute("Teacher",teacher);
//                RequestDispatcher rd=request.getRequestDispatcher("example.jsp");
//                rd.forward(request,response);
                service.setTeacher(subid,tid);
                RequestDispatcher rd=request.getRequestDispatcher("subject.jsp");
                rd.forward(request,response);
    }
}
