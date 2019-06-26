import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stubtry {
	       try {
		//Registering the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//Creating connection 
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CEIT-SRV-1.fnu.local:1521/orcl.fnu.local","hr","hr");

		//Creating Statement 
		Statement statement=con.createStatement();

		//Execute Query
		ResultSet rs =statement.executeQuery("select * from Employee");
		   

		    while(rs.next()) {
		 
		          System.out.println( 
		          rs.getInt(1)+"   "+rs.getString(2));     
		    }



		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    }

	}


