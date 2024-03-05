<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="pracs.prac_12.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            ArrayList Binding<br />
            <br />
            Drop down list:<br />
            <asp:DropDownList ID="DropDownList1" runat="server" >
            </asp:DropDownList>
            <br />
            Radio button list:<br />
            <asp:RadioButtonList ID="RadioButtonList1" runat="server">
            </asp:RadioButtonList>
            <br />
            Data list:<br />
            <asp:DataList ID="DataList1" runat="server">
                <ItemTemplate><%#Container.DataItem %></ItemTemplate>
            </asp:DataList>
            <br />
            DataGrid:<asp:GridView ID="GridView1" runat="server">
            </asp:GridView>
        </div>
    </form>
</body>
</html>
