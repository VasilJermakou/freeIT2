<%--
  Created by IntelliJ IDEA.
  User: Ermakov
  Date: 11.06.2021
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Alien JSP</title>
    </head>
    <body>
        <h1>Sorry, ${requestScope.user.firstName}, but U R not current client!</h1>

        <!-- this link doesnt work, need to fix !!! -->
        <p>U can pass the registration following this <a href="/html/forms.html">link</a></p>
    </body>
</html>
