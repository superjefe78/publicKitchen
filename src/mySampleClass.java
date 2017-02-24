//
//
//import com.kitchen.mel.ingredients.Ingredient;
////import com.mysql.jdbc.Connection;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//
//public class mySampleClass 
//{
//	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
//
//	public static final String URL = "jdbc:mysql://localhost/jdbcdb";
//	public static final String USER = "root";
//	public static final String PASSWORD = "";
//
//	public static void main(String[] args) 
//	{
//				// TODO Auto-generated method stub
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//	 	try 
//	 	{	
//	 		//Class.forName(DRIVER_CLASS);
//	
//			//conn = DriverManager.getConnection(URL, USER, PASSWORD);
//			//String sql = null;
//			//conn.prepareStatement(sql);
//			
//			
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			// conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdatabase?user=testuser&password=testpassword");
//						String connectionUrl = "jdbc:mysql://localhost:3306/mydb";
//						String connectionUser = "root";
//						String connectionPassword = "";
//						conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
//						stmt = conn.createStatement();
//						rs = stmt.executeQuery("SELECT * FROM mydb.ingredients;");
//						while (rs.next()) {
//							String id = rs.getString("ingredient_id");
//							String firstName = rs.getString("ingredient_name");
//							System.out.println("ID: " + id + ", First Name: " + firstName);		
//						}
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Howdy folks");
//		
//		Ingredient myNewIngredient = new Ingredient();
//		myNewIngredient.setIngredientFullName("Tomato");
//		System.out.println(myNewIngredient.getIngredientFullName());
//
//	}
//
//}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
 


public class mySampleClass 
{
	public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 



    public static void main(String[] args) {
 
        // creates three different Connection objects
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
 
        try {
            // connect way #1
//            String url1 = "jdbc:mysql://localhost:3306/test1";
//            String user = "root";
//            String password = "secret";
        	String url1 = "jdbc:mysql://localhost:3306/mydb";
        	String user = "root";
        	String password = null;
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
				//conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
				Statement stmt = conn1.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.ingredient;");
				while (rs.next()) {
					String id = rs.getString("ingredient_id");
					String firstName = rs.getString("ingredient_long_name");
					System.out.println("ID: " + id + ", First Name: " + firstName);		
				}

            }
 
            // connect way #2
//            String url2 = "jdbc:mysql://localhost:3306/test2?user=root&password=secret";
            String url2 = "jdbc:mysql://localhost:3306/mydb?user=root&password=";
            conn2 = DriverManager.getConnection(url2);
            if (conn2 != null) {
                System.out.println("Connected to the database test2");
            }
 
            // connect way #3
//            String url3 = "jdbc:mysql://localhost:3306/test3";
            String url3 = "jdbc:mysql://localhost:3306/mydb";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");
 
            conn3 = DriverManager.getConnection(url3, info);
            if (conn3 != null) {
                System.out.println("Connected to the database test3");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}