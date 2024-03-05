using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pracs.prac_7
{
    public partial class SessionState : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["BackgroundColor"] != null)
            {
                DropDownList1.SelectedValue=Session["BackgroundColor"].ToString();
                bodyTag.Style["Background-Color"] = DropDownList1.SelectedValue;
            }
        }

        protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
        {
            bodyTag.Style["background-color"] = DropDownList1.SelectedValue;
            Session["BackgroundColor"] = DropDownList1.SelectedValue;
        }
    }
}