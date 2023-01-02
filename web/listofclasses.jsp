<%@ page import="org.simplilearn.entities.EClass" %>
<%@ page import="java.util.List" %>
<%@ page import="org.simplilearn.entities.Subject" %>
<%@ page import="java.util.Set" %><%--
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
        <h1>Displaying Student List</h1>
            <table border ="1" width="500" align="center">
                 <tr bgcolor="00FF7F">
                     <th><b>Class ID</b></th>
                    <th><b>Class Name</b></th>
                    <th><b>Subjects</b></th>
                </tr>
            <%
                List<EClass> classes= (List<EClass>) request.getAttribute("Classes_List");
                for(EClass c:classes){    %>
            <tr>
                <td align="center"><%=c.getCid()%></td>
                <td align="center"><%=c.getCname()%></td>
                <td align="center">
                <%
                    Set<Subject> subjects=c.getSubjects();
                    for(Subject s:subjects){%>
                    <%out.println(s.getSubname()+",");
                    }%>
                </td>
             </tr>
            <%}%>
</table>
</body>
</html>
