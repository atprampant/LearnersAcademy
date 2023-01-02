<%@ page import="java.util.List" %>
<%@ page import="org.simplilearn.entities.Student" %>
<%@ page import="org.simplilearn.entities.EClass" %><%--
  Created by IntelliJ IDEA.
  User: dota_
  Date: 1/2/2023
  Time: 1:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Displaying Student List</h1>
    <table border ="1" width="500" align="center">
        <tr bgcolor="00FF7F">
            <th><b>Student Roll No</b></th>
            <th><b>Student Name</b></th>
            <th><b>Class</b></th>
        </tr>
        <%
                List<Student> students= (List<Student>) request.getAttribute("Student_List");
                for(Student s:students){    %>
        <tr>
            <td align="center"><%=s.getRollno()%></td>
            <td align="center"><%=s.getSname()%></td>
            <%EClass eclass=s.getEclass();%>
            <td align="center"><%=eclass.getCname()%></td>
        </tr>
        <%}%>
    </table>

</body>
</html>
