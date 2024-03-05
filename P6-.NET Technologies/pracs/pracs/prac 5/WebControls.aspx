<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebControls.aspx.cs" Inherits="pracs.prac_5.WebControls" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Drop down list: Auto post back </h2>
            <p>
                <asp:Label ID="Label1" runat="server" Text="Your favourite colour is "></asp:Label>
                <asp:Label ID="Label3" runat="server" Text=""></asp:Label>
            </p>
            <p>&nbsp;</p>
            <p>
                <asp:Label ID="Label2" runat="server" Text="Favourite Color:"></asp:Label>
                <asp:DropDownList ID="DropDownList1" runat="server" AutoPostBack="True" OnSelectedIndexChanged="DropDownList1_SelectedIndexChanged1">
                    <asp:ListItem>Green</asp:ListItem>
                    <asp:ListItem>Red</asp:ListItem>
                    <asp:ListItem>Blue</asp:ListItem>
                </asp:DropDownList>
            </p>

        </div>
    </form>
</body>
</html>
