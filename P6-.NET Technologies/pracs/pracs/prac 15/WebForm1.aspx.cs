using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pracs.prac_15
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            String t1 = DateTime.Now.ToLongTimeString();
            Label1.Text = "Showing time from panel control " + t1;
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            String t1 = DateTime.Now.ToLongTimeString();
            Label2.Text = "Showing time outside panel " + t1;

        }
    }
}