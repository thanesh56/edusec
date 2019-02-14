import java.sql.*;

public class DBLib {
	 Connection con;
	 Statement stmt;
	 ResultSet rs;
	 DBLib() {getStatement();}
	 public Statement getStatement() {
		String url,user,pass;
		url  = "jdbc:mysql://localhost:3306/edusec";
	        user = "root";
	        pass = "thaneshd";
	      	try {
	            con = DriverManager.getConnection(url,user,pass);
	            stmt = con.createStatement();     
	           }
		catch(SQLException c) {
	            System.out.println(c);
		 }
	        return stmt;
	} 
	public int insUpdateData(String sql) {
	  	int i = 0;
		try { 
			  i = stmt.executeUpdate(sql);
		}
		catch(SQLException c) {
			  System.out.println(c);
		}       
		return i;	
	}  
	public boolean searchData(String sql) {
	   	boolean b=false;
		try {
			 rs = stmt.executeQuery(sql);
			 b=rs.next();
		 } 	   
	        catch(SQLException c) {
			  System.out.println(c);
	  	}
		 return b; 
  	 }
	  public ResultSet selectData(String sql) {                 
		try {
			  rs = stmt.executeQuery(sql);
		 } 	   
	        catch(SQLException c) {
			  System.out.println(c);
	  	}
		 return rs; 
  	 }
}
