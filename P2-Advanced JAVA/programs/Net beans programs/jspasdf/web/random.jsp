<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4> In jsp file we used javabean getter & setter method</h4>

        <jsp:useBean id = "students" class = "com.bean.beans"> 
            <jsp:setProperty name = "students" property = "firstName" value="rashmi"/>
            <jsp:setProperty name = "students" property = "lastName" value="prabha"/>
            <jsp:setProperty name = "students" property = "age" value="40"/>


        </jsp:useBean>

        <p>Student First Name: 
            <jsp:getProperty name = "students" property = "firstName"/>
        </p>

        <p>Student Last Name: 
            <jsp:getProperty name = "students" property = "lastName"/>
        </p>

        <p>Student Age: 
            <jsp:getProperty name = "students" property = "age"/>
        </p>      
    </body>
</html>
