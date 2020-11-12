package Compilador1;

public class ValoresTabla implements Presentacion{
public String rango, tipo, nombre, valor, renglon;
	
	public ValoresTabla(String ran, String tip, String nom, String val, String reng) {
		
		rango = ran;
		tipo = tip;
		nombre = nom;
		valor = val;
		renglon = reng;
		
	}


	@Override
	public String[] getValues()
	{
		String[] values = {nombre,tipo,valor,renglon};
		return values;
	}
}
