using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pracs.prac_14
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            Label1.Text = "";
            string[] authors = new string[] {"jayesh","jay","yash","jivesh","rajesh","sunny"};
            var result = from author in authors where author.Contains("sh") orderby author select author;
            foreach (var author in result)
            {
                Label1.Text += author + "<br/>";
            }

        }
    }
}