using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace pracs.prac_12
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ArrayList MyArrayList = new ArrayList();
            MyArrayList.Add("Turbo C#");
            MyArrayList.Add("Turbo C#");
            MyArrayList.Add("Turbo C#");
            MyArrayList.Add("Turbo C#");
            MyArrayList.Add("Turbo C#");

            // Bind thwe control to the data
            DropDownList1.DataSource = MyArrayList;
            RadioButtonList1.DataSource = MyArrayList;
            DataList1.DataSource = MyArrayList;
            GridView1.DataSource = MyArrayList;
            //Bind all controls on the page
            Page.DataBind();

        }

    }
}