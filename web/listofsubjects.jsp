<%@ page import="org.simplilearn.entities.Subject" %>
<%@ page import="java.util.List" %>
<%@ page import="org.simplilearn.entities.Teacher" %><%--
  Created by IntelliJ IDEA.
  User: dota_
  Date: 1/2/2023
  Time: 1:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
            <h1>Displaying Subject List</h1>
                <table border ="1" width="500" align="center">
                    <tr bgcolor="00FF7F">
                        <th><b>Subject ID</b></th>
                        <th><b>Subject Name</b></th>
                        <th><b>Teacher's Name</b></th>
            </tr>
            <%
                List<Subject> subjects= (List<Subject>) request.getAttribute("Subjects_List");
                for(Subject s:subjects){    %>
                <tr>
                    <td align="center"><%=s.getSubid()%></td>
                    <td align="center"><%=s.getSubname()%></td>
                    <%Teacher teacher=s.getTeacher();%>
                    <td align="center"><%=teacher.getTname()%></td>
                </tr>
            <%}%>
</table>
</body>
</html>
