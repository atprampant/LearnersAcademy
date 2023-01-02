package org.simplilearn.controllers;

import org.simplilearn.entities.User;
import org.simplilearn.services.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    UserService service = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
//        out.println("<html><body>");
//        out.println(username);
//        out.println(password);
//        out.println("</html></body>");
//        String user="atprampant";
//        String pass="anshul10";
//        if(username.equals("user")&&password.equals(pass))
//        {RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
//            rd.forward(request, response);}
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atp", "root", "root");
//            PreparedStatement ps = con.prepareStatement("select * from user");
//            ResultSet rs = ps.executeQuery();
//
//            while(rs.next())
//            {
//                if(username.equals(rs.getString("username"))&&password.equals(rs.getString("password")))
//                {
//                    RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
//                    rd.forward(request, response);
//                }
//            }
//            response.sendRedirect("index.jsp");
        if (service.loginUser(username,password)) {

            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }

//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}