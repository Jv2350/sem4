using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pracs.prac_7
{
    public partial class ApplicationState : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void Button_Click(object sender, EventArgs e)
        {
            int counter = 0;
            if (Application["ButtonClickCounter"] != null)
            {
                counter = (int)Application["ButtonClickCounter"];
            }
            counter++;
            Application["ButtonClickCounter"]=counter;
            Label1.Text="Button Clicked: "+counter.ToString()+" times";
        }
    }
}