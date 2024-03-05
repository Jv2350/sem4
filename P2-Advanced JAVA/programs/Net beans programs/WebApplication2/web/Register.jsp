<%@page import="java.sql.*"%>
<%
    String user_id = request.getParameter("t1");
    String password = request.getParameter("t2");
    String first_name = request.getParameter("t3");
    String last_name = request.getParameter("t4");
    String email = request.getParameter("t5");
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imformation", "root","101255");
        PreparedStatement ps = con.prepareStatement("insert into information values(?,?,?,?,?)");
        ps.setString(1, user_id);
        ps.setString(2, password);
        ps.setString(3, first_name);
        ps.setString(4, last_name);
        ps.setString(5, email);
        ps.executeUpdate();
        out.println("Registration done!");
    } 
    catch (Exception e)
    {
        out.println("Error:" + e);
    }
%>
