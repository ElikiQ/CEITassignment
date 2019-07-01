import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginJDBC {

	public static void main(String[] args)  {
	
	try {
		
    Class.forName("oracle.jdbc.driver.OracleDriver");

	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CEIT-SRV-1.fnu.local:1521/orcl.fnu.local","hr","hr");
	Statement statement=con.createStatement();
	
	ResultSet rs =statement.executeQuery("select * from Employee");
	
	while(rs.next()) {	
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  	
	}
	con.close();
	
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}