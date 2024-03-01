<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>

        <%@page import="java.util.Date"%>
        <%!
            Date date; 
        %>
        <% 
            date = new Date();
        %>
        <b>System date and time: </b> <%= date %>
    </body>
</html>
