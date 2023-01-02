<%@ page import="org.simplilearn.entities.Subject" %>
<%@ page import="org.simplilearn.entities.Teacher" %><%--
  Created by IntelliJ IDEA.
  User: dota_
  Date: 1/2/2023
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <% Subject subject= (Subject) request.getAttribute("Subject");%>
        <%=subject.getSubid()%>
        <%=subject.getSubname()%>
        <%Teacher teacher1=subject.getTeacher();%>
        <%=teacher1.getTname()%>
        <%=teacher1.getAge()%>
        <% Teacher teacher= (Teacher) request.getAttribute("Teacher");%>
        <%=teacher.getTname()%>
        <%=teacher.getAge()%>
</body>
</html>
