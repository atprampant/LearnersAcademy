<%--
  Created by IntelliJ IDEA.
  User: dota_
  Date: 1/2/2023
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="./setsubject" method="post">
          Enter Class id : <input type="text" name="cid"><br/>
          Enter Subject id(first three letters) : <input type="text" name="subid"><br/>
          <button type="submit">Add subject to class</button>
        </form>
</body>
</html>
