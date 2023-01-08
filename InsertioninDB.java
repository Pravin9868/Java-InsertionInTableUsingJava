package pkg;

import java.sql.Connection;
import java.sql.*;

public class InsertioninDB {

	public static void main(String[] args) {
		
		
		String str=String.format("insert into tblstudent(Sname) values('Rivansh Shrivastav');");  
		//Manually data is inserted in MYSQL Table..
		//or Static Data is INerted in the table 
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mca","root","root");
	        Statement st=con.createStatement();
	        int x= st.executeUpdate(str);
           if(x==1) {
        	   System.out.println("Record Successfully Inserted ");
           }
           else {
        	   System.out.println("Not Inserted");
           }
           ResultSet rs=st.executeQuery("select * from tblstudent;"); // here as you can see data is displayed here.. 
           while(rs.next()) {
        	   System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||");
           }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
