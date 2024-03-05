using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pracs.prac_7
{
    public partial class Cookies : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Request.Cookies["BackgroundColor"] != null)
            {
                DropDownList1.SelectedValue = Request.Cookies["BackgroundColor"].Value;
                bodyTag.Style["background-color"] = DropDownList1.SelectedValue;
            }
        }

        protected void DropDownList1_SelectedIndexChanged(object sender, EventArgs e)
        {
            bodyTag.Style["background-color"] = DropDownList1.SelectedValue;
            HttpCookie cookie = new HttpCookie("BackgroundColor");
            cookie.Value = DropDownList1.SelectedValue;
            cookie.Expires = DateTime.Now.AddSeconds(3);
            Response.SetCookie(cookie);

        }
    }
}