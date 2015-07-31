package c.neo.insertAuto;

public class Datos_Auto {
	
	public String datoAuto;

	public String getDatoAuto() {
		return datoAuto;
	}

	public void setDatoAuto(String datoAuto) {
		this.datoAuto = datoAuto;
	}
	
	public String regresarDatos(String strFolio) {
		ConnectionDB con = new ConnectionDB();
		sqlQuery sql = new sqlQuery(con.getConnection());
		setDatoAuto(sql.search("SELECT * FROM tblAutos_Bol tb "
				+ "INNER JOIN dbNFCtest.tblTipoAuto_Bol tt on  tt.intIdTipoAuto =  tb.intIdTipoAuto "
				+ "WHERE strFolio = '"+strFolio+"';"));
		return datoAuto;
	}
	
	public void insertaFecha(String strFolio, String fechaVencimiento) {
		ConnectionDB con = new ConnectionDB();
		sqlQuery sql = new sqlQuery(con.getConnection());
		sql.insertaFecha("UPDATE tblAutos_Bol "
				+ "SET dtmFechaExpiracion='"+fechaVencimiento+"' "
				+ "WHERE strFolio='"+strFolio+"';");
	}
}
