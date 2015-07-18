package c.neo.auto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlQuery {
	Connection conexion;
    Statement sentencia;
    ResultSet resultado;
    Object [] datosLogIn = null;
    
    public sqlQuery (Connection con){
        conexion = con;
    }

    public String search(String cad_sql){
    	String data = "";
    	try{
    		sentencia=conexion.createStatement();
    		resultado = sentencia.executeQuery(cad_sql);
    		    		
    		while (resultado.next()){
    			data = resultado.getString("strFolio")+"|"+
    					resultado.getString("strMarca")+"|"+
    					resultado.getString("strSubMarca")+"|"+
    					resultado.getString("strPlaca")+"|"+
    					resultado.getString("strAnioModelo")+"|"+
    					resultado.getString("strImgAuto")+"|"+
    					resultado.getString("dtmFechaExpiracion")+"|"+
    					resultado.getString("strTipoAuto");
    		}
    	}catch (SQLException E){
    	}
    	return data;
    }
}