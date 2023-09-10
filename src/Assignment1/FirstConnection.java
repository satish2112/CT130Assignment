package Assignment1;
import java.sql.*;
import java.sql.DriverManager;
public class FirstConnection {

	public static void main(String[] args)throws Exception {
		String url="jdbc:mysql://localhost:3306/gvm";
		String uname="satish";
		String pass="12345678";
		String query="select * from student";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())  {
//		String name=rs.getString("uname");
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		}
		
//		System.out.println(name);
		st.close();
		rs.close();
		
	}

}
