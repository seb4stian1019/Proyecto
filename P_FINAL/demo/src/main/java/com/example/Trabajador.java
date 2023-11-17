package com.example;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Trabajador {
    String nombre;
	String apellido;
	int licencia;
	String email;
	int numCel;
	ArrayList<String>lista = new ArrayList<String>();
	
	public Trabajador() {
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del trabajador: ");
		apellido = JOptionPane.showInputDialog("Ingrese el apellido del trabajador: ");
		licencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la licencia: ")) ;
		email = JOptionPane.showInputDialog("Ingrese su email: ");
		numCel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de celular: ")) ;
	}
	
	public Trabajador(String nombre, String apellido, int licencia, String email,  int numCel){
		this.nombre = nombre;
		this.apellido = apellido;
		this.licencia = licencia;
		this.email = email;
		this.numCel = numCel;
		
		lista.add(nombre);
		lista.add(apellido);
		lista.add(licencia+"");
		lista.add(email);
		lista.add(numCel+"");
	}

    
}
