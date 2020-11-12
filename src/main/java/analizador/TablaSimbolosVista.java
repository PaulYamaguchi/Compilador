package Compilador1;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaSimbolosVista extends JFrame{
	
	private JTable tablaSimbolos;
	private Vector<String> headers = new Vector<String>(Arrays.asList("Nombre","Tipo","Valor","Linea"))  ;
	private Vector<Vector<String>> data;
	private int tipo;
	
	public TablaSimbolosVista(ArrayList<Presentacion> tablaSimbolosList, int tipo) {
		headers = tipo == 1? new Vector<String>(Arrays.asList("Nombre","Tipo","Valor","Linea")):
			new Vector<String>(Arrays.asList("Expresion","Operador","Operando 1","Operando 2","Resultado"));
		data = new Vector<Vector<String>>();
		this.tipo = tipo;
		fillVector(tablaSimbolosList);
		this.tablaSimbolos = new JTable(data,headers);
		this.add(new JScrollPane(tablaSimbolos),BorderLayout.CENTER);
	}
	
	private void fillVector(ArrayList<Presentacion> tablaSimbolosList) {
		Vector<String> row = new Vector<String>();
		for(Presentacion symbol : tablaSimbolosList) {
			String[] values = symbol.getValues();
			for(int i = 0; i < values.length; i++) {
				row.add(i, values[i]);
			}
			data.add(row);
			row = new Vector<String>();
		}
	}

}