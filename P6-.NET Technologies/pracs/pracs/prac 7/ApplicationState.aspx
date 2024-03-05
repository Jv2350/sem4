<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ApplicationState.aspx.cs" Inherits="pracs.prac_7.ApplicationState" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>ASP.NET appplication Status Example</h2>
            <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label><br />
            <br />
            <asp:Button ID="Button1" runat="server" Text="Show button click Status" OnClick="Button_Click"/>
        </div>
    </form>
</body>
</html>
