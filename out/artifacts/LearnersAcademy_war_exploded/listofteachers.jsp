<%@ page import="org.simplilearn.entities.Teacher" %>
<%@ page import="java.util.List" %><%--
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
        List<Teacher> teachers= (List<Teacher>) request.getAttribute("Teacher_List");
        for(Teacher t:teachers){    %>
    <tr>
        <td align="center"><%=t.getTid()%></td>
        <td align="center"><%=t.getTname()%></td>
        <td align="center"><%=t.getAge()%></td>
    </tr>
    <%}%>
</table>
</body>
</html>
