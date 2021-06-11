<%--
  Created by IntelliJ IDEA.
  User: Ermakov
  Date: 11.06.2021
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Current User JSP</title>
    </head>
    <body>
        <h1>Greeting, ${requestScope.user.firstName}</h1>
        <p>As U R our current user, we can show u your data:</p>
        <ul>
            <li>First name: ${requestScope.user.firstName}</li>
            <li>Last name: ${requestScope.user.lastName}</li>
            <li>Phone: ${requestScope.user.phone}</li>
            <li>Email: ${requestScope.user.email}</li>
        </ul>
    </body>
</html>
