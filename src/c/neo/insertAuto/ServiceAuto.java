package c.neo.insertAuto;

public class ServiceAuto {
	
	public String datosUsr (String srtFolio){
		Datos_Auto datos = new Datos_Auto();
		return datos.regresarDatos(srtFolio);
	}
	
	public void insertDate (String srtFolio, String fechaVencimiento){
		Datos_Auto datos = new Datos_Auto();
		datos.insertaFecha(srtFolio, fechaVencimiento);
	}
}
