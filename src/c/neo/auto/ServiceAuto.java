package c.neo.auto;

public class ServiceAuto {
	
	public String datosUsr (String srtFolio){
		Datos_Auto datos = new Datos_Auto();
		return datos.regresarDatos(srtFolio);
	}
}
