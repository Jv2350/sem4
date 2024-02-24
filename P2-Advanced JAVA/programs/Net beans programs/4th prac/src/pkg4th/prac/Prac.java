//Write a JDBC program to create table and insert values in it.
package pkg4th.prac;

import java.sql.*;

public class Prac {
    public Prac() throws SQLException{
        Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/4th prac","abc","abc");
        System.out.println("Connection Established");
        
        Statement s = c.createStatement();
        System.out.println("Statement is created");
 
        s.executeUpdate("drop table student"); //if table already exist
        s.executeUpdate("create table student(sRollNo int, sName varchar(20))");
        System.out.println("Table is created");
        
        s.executeUpdate("insert into student values(1,'jayesh')");
    }
    public static void main(String[] args) throws SQLException {
        new Prac();
    }    
}
