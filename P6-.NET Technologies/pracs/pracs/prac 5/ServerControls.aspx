<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ServerControls.aspx.cs" Inherits="pracs.prac_5.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            Name:
            <asp:TextBox ID="TextBox1" runat="server">Hello World</asp:TextBox>
            <br />
            <br />
            Address:
            <asp:TextBox ID="TextBox2" runat="server">Hello World</asp:TextBox>
            <br />
            <br />
            Country :
            <asp:TextBox ID="TextBox3" runat="server">Hello World</asp:TextBox>
            <br />
            <br />
            Gender:
            <asp:RadioButtonList ID="RadioButtonList1" runat="server" AutoPostBack="True" RepeatDirection="Horizontal">
                <asp:ListItem Enabled="False">Male</asp:ListItem>
                <asp:ListItem>Female</asp:ListItem>
                <asp:ListItem>Other</asp:ListItem>
            </asp:RadioButtonList>
            <br />
            Hobbies:<asp:CheckBoxList ID="CheckBoxList1" runat="server" AutoPostBack="True" OnSelectedIndexChanged="CheckBoxList1_SelectedIndexChanged" RepeatDirection="Horizontal">
                <asp:ListItem>Reading</asp:ListItem>
                <asp:ListItem>Writing</asp:ListItem>
                <asp:ListItem>Playing</asp:ListItem>
            </asp:CheckBoxList>
            <br />
            <br />
            Email id:
            <asp:TextBox ID="TextBox4" runat="server">Hello World</asp:TextBox>
            <br />
            <br />
            Your Birthdate is:
            <asp:Label ID="Label1" runat="server" Text="00/00/0000"></asp:Label>
            <br />
            <asp:Calendar ID="Calendar1" runat="server" OnSelectionChanged="Calendar1_SelectionChanged" TitleFormat="Month"></asp:Calendar>
            <br />
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Button" />
            <br />
        </div>
    </form>
</body>
</html>
