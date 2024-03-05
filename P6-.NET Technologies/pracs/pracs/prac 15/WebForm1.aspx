<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="pracs.prac_15.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:ScriptManager ID="ScriptManager1" runat="server">
            </asp:ScriptManager>
            <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                <ContentTemplate>
<br />
                    <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
            <br />
                    <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Partial postback" />
            <br />
            
                </ContentTemplate>
            </asp:UpdatePanel>
            <br />
            <br />
            <br />
            <asp:Label ID="Label2" runat="server" Text="Label"></asp:Label>
            <br />
            <asp:Button ID="Button2" runat="server" Text="Total postback" OnClick="Button2_Click" />
        </div>
    </form>
</body>
</html>
