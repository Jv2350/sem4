<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="default.aspx.cs" Inherits="pracs.prac_10._default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <asp:Menu ID="Menu1" runat="server" Orientation="Horizontal">
                <DynamicHoverStyle BackColor="Black" ForeColor="White" />
                <DynamicMenuItemStyle HorizontalPadding="5px" VerticalPadding="2px" />
                <DynamicMenuStyle BackColor="Black" />
                <DynamicSelectedStyle BackColor="Black" />
                <Items>
                    <asp:MenuItem NavigateUrl="~/prac 10/home.aspx" Text="Home" Value="Home"></asp:MenuItem>
                    <asp:MenuItem NavigateUrl="~/prac 10/aboutUs.aspx" Text="About us" Value="About us"></asp:MenuItem>
                    <asp:MenuItem NavigateUrl="~/prac 10/product.aspx" Text="Product" Value="Product"></asp:MenuItem>
                    <asp:MenuItem NavigateUrl="~/prac 10/reviews.aspx" Text="Reviews" Value="Reviews"></asp:MenuItem>
                    <asp:MenuItem NavigateUrl="~/prac 10/contactNo.aspx" Text="Contact No" Value="Contact No"></asp:MenuItem>
                </Items>
            </asp:Menu>
            <br />
            <br />
            <asp:TreeView ID="TreeView1" runat="server" Font-Names="Cascadia Code" ImageSet="BulletedList2">
                <HoverNodeStyle Font-Underline="True" ForeColor="#5555DD" />
                <Nodes>
                    <asp:TreeNode NavigateUrl="~/prac 10/home.aspx" Text="Home" Value="Home"></asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/prac 10/aboutUs.aspx" Text="About us" Value="About us"></asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/prac 10/product.aspx" Text="Product" Value="Product"></asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/prac 10/reviews.aspx" Text="Reviews" Value="Reviews"></asp:TreeNode>
                    <asp:TreeNode NavigateUrl="~/prac 10/contactNo.aspx" Text="Contact No" Value="Contact No"></asp:TreeNode>
                </Nodes>
            </asp:TreeView>
        </div>
    </form>
</body>
</html>
