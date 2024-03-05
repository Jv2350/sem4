<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <body bgcolor="#F0E68C"></body> 
    <form ACTION="Register.jsp" METHOD="post">
        <h1 ALIGN="Center"><u>-:New User Registration:-</u></h1>
        <TABLE  BORDER="0" ALIGN="center" CELLPADDING="30">
            <TR>
                <TD>User ID : </TD>
                <TD ALIGN="Center">
                    <INPUT  TYPE="text" SIZE="25" NAME="t1">  
                </TD>
            </TR>
            <TR>
                <TD>Password : </TD>
                <TD ALIGN="Center">
                    <INPUT  TYPE="password" SIZE="25" NAME="t2" >
                </TD>
            </TR>
            <TR>
                <TD>First Name : </TD>
                <TD ALIGN="Center">
                    <INPUT  TYPE="text" SIZE="25" NAME="t3" >
                </TD>
            </TR>
            <TR>
                <TD>Last Name : </TD>
                <TD ALIGN="Center">
                    <INPUT  TYPE="text" SIZE="25" NAME="t4" >
                </TD>
            </TR>
            <TR>
                <TD>Email Address : </TD>
                <TD ALIGN="center">
                    <INPUT  TYPE="text" SIZE="25" NAME="t5" >
                </TD>
            </TR>
            <TR>
                <TD></TD>
                <TD ALIGN="center">
                    <INPUT  TYPE="submit" VALUE="Submit" >
                </TD>
            </TR>
        </TABLE>
    </form>
</html>
