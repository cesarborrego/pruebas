package c.neo.auto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {
	Connection conexion = null;
	
	public Connection getConnection(){		
	    
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch(Exception ff){
                System.out.print("No se encontro el Driver");
        }
		 try {
			 String host = "148.245.107.245";
			 String nombredb= "dbNFCtest";
			 String puerto="3306";
			 String url="jdbc:mysql://"+host+":"+puerto+"/"+nombredb;
			 String usuario = "desarrollo";
			 String password = "desarrollo01";

			conexion=DriverManager.getConnection(url,usuario,password);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conexion;
	}

	public void closeConnection(){
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
