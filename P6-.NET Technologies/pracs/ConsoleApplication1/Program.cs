using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int No1, No2, No3, No4, Product;
            Console.WriteLine("Enter Four Numbers");
            No1 = Convert.ToInt32(Console.ReadLine());
            No2 = Convert.ToInt32(Console.ReadLine());
            No3 = Convert.ToInt32(Console.ReadLine());
            No4 = Convert.ToInt32(Console.ReadLine());
            Product = No1 * No2 * No3 * No4;
            Console.WriteLine("Product of Given Number Is:" + Product);
            Console.ReadLine();
        }
    }
}
