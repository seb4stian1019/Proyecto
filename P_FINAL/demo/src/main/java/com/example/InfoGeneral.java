package com.example;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class InfoGeneral {
    String area;
    LocalDate fecha;
    LocalTime hora;
    int plantasAtendidas;
    String estadoSalud;
    String crecimiento;
    String estado;
    Trabajador miTrabajador = new Trabajador();
    ArrayList<String> arr = new ArrayList<>();

    public void Cuidado() {
        plantasAtendidas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de la planta a atender: \n 1. Arboles \n 2. Suculentas \n 3. Arbustos"));
        area = JOptionPane.showInputDialog("Ingrese el nombre del area donde se va a realizar el cuidado: ");

        // Obtener la fecha del usuario y convertirla a LocalDate
        String fechaString = JOptionPane.showInputDialog("Ingrese la fecha del cuidado (Formato: YYYY-MM-DD)");
        fecha = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Obtener la hora del usuario y convertirla a LocalTime
        String horaString = JOptionPane.showInputDialog("Ingrese la hora del cuidado (Formato: HH:mm)");
        hora = LocalTime.parse(horaString, DateTimeFormatter.ofPattern("HH:mm"));

        JOptionPane.showConfirmDialog(null, "El trabajador que va a estar a cargo del proceso va a ser: " + miTrabajador.nombre);
        estadoSalud = JOptionPane.showInputDialog("Cual es el estado de salud de la planta: \n Buena \n Regular \n Mala");
        crecimiento = JOptionPane.showInputDialog("Cual es el estado de crecimiento de la planta: \n Rapido \n Lento ");
        estado = JOptionPane.showInputDialog("Cual es el estado del cuidado de la planta: \n 1. Pendiente \n 2. En proceso \n 3. Finalizado \n 4.  Aplazado");

        estado();
        arr.add("plantasAtendidas = 1");
        arr.add("area = " + area);
        arr.add("fecha = " + fecha);
        arr.add("hora = " + hora);
        arr.add("estadoSalud = " + estadoSalud);
        arr.add("crecimiento = " + crecimiento);
        arr.add("estado = " + estado);
        imprimir(arr);
    }

    public void Info(String area, LocalDate fecha, LocalTime hora, int plantasAtendidas) {
		this.area = area;
		this.fecha = fecha;
		this.hora = hora;
		this.plantasAtendidas = plantasAtendidas;
	}

		public void estado() {
			if (estado.equalsIgnoreCase("pendiente")) {
				JOptionPane.showConfirmDialog(null, "El estado en el que se encuentra la planta es pendiente, por lo tanto el cuidado aun no se ha realizado");
			} else if (estado.equalsIgnoreCase("en proceso")) {
				JOptionPane.showConfirmDialog(null,"El estado en el que se encuentra la planta es en proceso, por lo tanto el cuidado ya ha iniciado");
			} else if (estado.equalsIgnoreCase("finalizado")) {
				JOptionPane.showConfirmDialog(null,"El estado en el que se encuentra la planta se encuentra finalizado, por lo tanto el cuidado ya ha concluido");
			} else if (estado.equalsIgnoreCase("aplazado")) {
				JOptionPane.showConfirmDialog(null,"El estado de la planta se encuentra en aplazado, por lo tanto el cuidado aun no se puede realizar");
			}
		}
	
	
	public void imprimir(ArrayList<String> arr) {
		System.out.println("Informacion almacenada\n");
    	for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}