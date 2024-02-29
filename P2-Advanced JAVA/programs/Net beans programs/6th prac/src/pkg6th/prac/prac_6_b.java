package pkg6th.prac;

import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class prac_6_b {

    public static void main(String[] args) throws SQLException, FileNotFoundException {
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/prac6", "prac6", "prac6");
            System.out.println("Connection Established");
            java.sql.Statement stmt = con.createStatement();
            //If table is already created, then comment below statements
            /*   String createTable = "CREATE TABLE Tutorial( "
                + "Name VARCHAR(255), "
                + "Type VARCHAR(50), "
                + "Logo BLOB)";
     	stmt.execute(createTable);
                System.out.println("table created");*/
            //Inserting values
            String query = "INSERT INTO Tutorial(Name, Type, Logo) VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "Advance Java");
            pstmt.setString(2, "A Java Practical");
            FileInputStream fin = new FileInputStream("D:\\img.png");
            pstmt.setBinaryStream(3, fin);
            pstmt.execute();
            System.out.println("Data inserted");
            // ResultSet rs = stmt.executeQuery("Select *from Tutorial");
            // selecting only logo field from the table
            ResultSet rs = stmt.executeQuery("Select logo from Tutorial");
            int i = 0;
            while (rs.next()) {
                // below code is used to display output on the output window in the application itself
                /* System.out.print("Name: "+rs.getString("Name")+", ");
                     System.out.print("Tutorial Type: "+rs.getString("Type")+", ");
                     System.out.print("Logo: "+rs.getBlob("Logo"));
                     System.out.println();*/

                InputStream in = rs.getBinaryStream(1);
                OutputStream f = new FileOutputStream(new File("test" + i + ".jpg"));
                i++;
                int c = 0;
                while ((c = in.read()) > -1) {
                    f.write(c);
                }
                f.close();
                in.close();
            }
            System.out.println("File is created.");
 //To check the image file, Go in Files tab, select your project & expand build.xml, all images with test name will be displayed.");
 }catch (Exception e) {
            System.out.println("Exception generated : " + e);
        }
    }
}
