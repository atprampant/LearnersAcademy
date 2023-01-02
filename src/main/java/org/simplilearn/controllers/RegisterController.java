package org.simplilearn.controllers;

import org.simplilearn.services.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.beans.PropertyEditorSupport;
import java.io.IOException;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
    UserService service=new UserService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        service.createUser(username,password);
        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
        rd.forward(request,response);
    }
}
