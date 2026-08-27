package com.mycompany.ejercicio3;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
/**
 *
 * @author ANTHONY RIVERA SIÑA
 */
public class ejercicio3 {

    public static void main(String[] args) {
        
        Scanner lector =new Scanner(System.in);
        
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm");
        
        String nombre, apellido, origen, destino;
        
        int Ndni;
        
        double costo;
        
        System.out.println("Ingrese el nombre del pasajero:");
        
        nombre = lector.nextLine();
        String Mnombre = nombre.toUpperCase();
        
        System.out.println("Ingrese el apellido del pasajero:");
        
        apellido = lector.nextLine();
        String Mapellido = apellido.toUpperCase();
        
        System.out.println("Ingrese el dni del pasajero:");
        
        Ndni = lector.nextInt();
        
        String Dni = String.valueOf(Ndni);
        
        lector.nextLine();
        
        System.out.println("Ingrese el origen del viaje:");
        
        origen = lector.nextLine();
        String Morigen = origen.toUpperCase();
        
        System.out.println("Ingrese el destino del viaje:");
        
        destino = lector.nextLine();
        String Mdestino = destino.toUpperCase();
        
        System.out.println("Ingrese la fecha del viaje (dd/MM/aaaa):");
        
        String entrada1 = lector.nextLine();
        
        System.out.println("Ingrese la hora del viaje (HH:mm):");
        
        String entrada2 = lector.nextLine();
        
        System.out.println("Ingrese el costo del boleto");
        
        costo=lector.nextDouble();
        
        System.out.println("BUSES TAKANA \n\tBoleto Nº: 73619 \n");
        
        System.out.println(Mnombre + Mapellido + "/" + Dni + " /SiBUS V. 1.0.0 \n\nOrigen\t\t: " + Morigen + "\n\nDestino\t\t: " + Mdestino);
        
        try {
            LocalDate fechaV = LocalDate.parse(entrada1, formato1);
            System.out.println("\nFecha Viaje\t: " + fechaV);
        } catch (DateTimeParseException e) {
            System.out.println("\nFecha Viaje\t: Formato incorrecto");
        }     
        
        try {
            LocalTime horaV = LocalTime.parse(entrada2, formato2);
            System.out.println("\nHora Viaje\t: " + horaV);
        } catch (DateTimeParseException e) {
            System.out.println("\nHora Viaje\t: Formato incorrecto");
        }
        
        System.out.println("\nAsiento\t\t: 35 \n\nAndenes\t\t: 20 AL 31\n\nValor Pasaje\t: " + costo + " ( EFECTIVO ) \n\nBOLETA VENTA EN OFICINA\n\nNro Boleto\t: 73619");
    }
}
