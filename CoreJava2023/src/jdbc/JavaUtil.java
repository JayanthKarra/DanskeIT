package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaUtil extends TestJDBC {

		public  Connection getConnection() {
			String dbURL = "jdbc:mysql://localhost:3306/florida?useSSL=false";
			String username = "root";
			String password = "rootroot";
			 
			try {
				
			    Connection conn = DriverManager.getConnection(dbURL, username, password);
			     if (conn != null)
			     { 		    
			     return conn;
			     }
			} catch (SQLException ex) {
			    ex.printStackTrace();
			}
			return null;
		}
		
		
		public void insertUser(long id, String firstname,String  lastname, String email)
		
		{			
			Connection conn =null;
	
			try {
				conn= getConnection();	
				System.out.println(" COnnection : "+conn);
				String sql = "INSERT INTO Users (id, email, firstname, lastname) VALUES (?, ?, ?, ?)";
				 PreparedStatement statement;
				statement = conn.prepareStatement(sql);
				
				statement.setLong(1, id);
				statement.setString(2, email);
				statement.setString(3, firstname);
				statement.setString(4, lastname);
				int rowsInserted = statement.executeUpdate();
				if (rowsInserted > 0) {
				    System.out.println("A new user was inserted successfully!");
				}
				 conn.close();
			} catch (SQLException e) {
				//e.printStackTrace();
			
			}
		}
		
		public void displayRecord()
		{ System.out.println(" in");
			String sql = "SELECT * FROM Users";
			 Connection conn=null;
			Statement statement;
			try {
				conn=getConnection();
				System.out.println(" COnnection : "+conn);
				statement = conn.createStatement();				
				ResultSet result = statement.executeQuery(sql);		
				System.out.println("ResultSet : "+result);
				int count = 0;				 
				while (result.next()){
			    	Long id = result.getLong(1);
				    String email = result.getString(2);
				    String firstname = result.getString(3);
				    String lastname = result.getString(4);
				   System.out.println("Id:"+id +",  Name:"+ firstname+lastname +", Email :"+email );
				}
				conn.close();
			} catch (SQLException e) {
							e.printStackTrace();
			}
		
		}
		
		public void deleteRecord(Long id)
		{ 	 Connection conn=null;
			 try {
			conn=getConnection();
			System.out.println(" Connection : "+conn);
			String sql = "DELETE FROM Users WHERE id=?";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setLong(1, id);
			 
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
			    System.out.println("A user was deleted successfully!");
			}
			conn.close();
				} catch (SQLException e) {
								e.printStackTrace();
				}
		}
		
		
		public void  updateRecord(Long id)
		{	Connection conn=null;
			 try {
					conn=getConnection();
					System.out.println(" Connection : "+conn);
					String sql = "UPDATE Users SET firstname=?, lastname=?, email=? WHERE id=?";
					 
					PreparedStatement statement = conn.prepareStatement(sql);
					
					statement.setString(1, "WilliamChanged" );
					statement.setString(2, "JamesChanged");
					statement.setString(3, "James@gmail.com");
					statement.setLong(4, id);
					System.out.println(" in");
					int rowsUpdated = statement.executeUpdate();
					if (rowsUpdated > 0) {
						   System.out.println("An existing user was updated successfully!");
					}
					conn.close();
				} catch (SQLException e) {
							e.printStackTrace();
				}
		}
}
