package Assignment1;
import java.sql.*;
public class SecondConnection {

	public static void main(String[] args)throws Exception {
		Connection con=null;
        Statement st=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/satish","root@localhost","Srikant1");
            String sql="insert into employee values(105,'rahul',104)";
           st=con.createStatement();
            int x=st.executeUpdate(sql);
            if(x==1)
                System.out.println("record inserted");
            else
                System.out.println("record not inserted");
            }catch(Exception e){
                e.printStackTrace();
                }
            finally{
                try{
                    if(st!=null)
                        st.close();
                    if(con!=null)
                        con.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
            }
    }	
}

