<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4> In jsp file we used javabean getter & setter method</h4>

        <jsp:useBean id="students" class="com.bean.StudentsBean">
            <jsp:setProperty name="students" property="firstName" value="Jayesh"/>
            <jsp:setProperty name="students" property="lastName" value="Verma"/>
            <jsp:setProperty name="students" property="age" value="19"/>
        </jsp:useBean>

        <p>Student First Name:
            <jsp:getProperty name="students" property="firstName"/>
        </p>

        <p>Student Last Name:
            <jsp:getProperty name="students" property="lastName"/>
        </p>

        <p>Student Age:
            <%= students.getAge() %>
        </p>

    </body>
</html>
