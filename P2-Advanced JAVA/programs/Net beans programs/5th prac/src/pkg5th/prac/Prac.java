//Develop a Java application to perform CRUD operation using JDBC.
package pkg5th.prac;

import java.sql.*;

public class Prac {

    public Prac() throws SQLException {
        Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/prac5", "prac5", "prac5");
        System.out.println("Connection Established");

        Statement s = c.createStatement();
        System.out.println("Statment is created");

//        create
        s.executeUpdate("create table student(sRollNo int, sName varchar(20))");
        System.out.println("Table is created");

//        read 
        s.executeUpdate("insert into student values(1,'jayesh'),(2,'ramesh')");
        System.out.println("Values are inserted");

//        update
        s.executeUpdate("update student set sname='Jayesh' where sRollNo=1");
        System.out.println("Name\t\tRoll No.\n");

//        delete
//        s.executeUpdate("delete from student where sname='Jayesh'");
        ResultSet r = s.executeQuery("select * from student");
        while (r.next()) {
            int RollNo = r.getInt("sRollNo");
            String Name = r.getString("sName");

            System.out.println(Name + "\t\t " + RollNo);
        }
    }

    public static void main(String[] args) throws SQLException {
        new Prac();
    }
}
