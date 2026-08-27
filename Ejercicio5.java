package com.mycompany.ejercicio5;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author ANTHONY RIVERA SIÑA
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        
        LocalDateTime ahora = LocalDateTime.now();
        
        String nombre, moneda, tarjeta, direccion;
        
        int importe, saldoinicial = 200, saldofinal;
        
        System.out.println("Ingrese el numero de tarjeta:");
        
        tarjeta = lector.nextLine();
        
        System.out.println("Ingrese el nombre del titular:");
        
        nombre = lector.nextLine();
        String Mnombre = nombre.toUpperCase();
        
        System.out.println("Ingrese su direccion:");
        
        direccion = lector.nextLine();
        String Mdireccion = direccion.toUpperCase();
        
        System.out.println("Ingrese el tipo de moneda (SOLES/DOLARES/EUROS):");
        
        moneda = lector.nextLine();
        String Mmoneda = moneda.toUpperCase();
        
        System.out.println("Ingrese la cantidad de importe:");
        
        importe = lector.nextInt();
        
        saldofinal = saldoinicial + importe;
        
       DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yy");
       
        String fechaStr = ahora.format(formatoFecha);
               
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        
        String horaStr = ahora.format(formatoHora);
        
        System.out.println("\t\t\t\tSUBANCO\n\n FECHA\t\t HORA\t\t CAJERO\t\t NRO. TRAN.");
        System.out.println(fechaStr + "\t " + horaStr + "\t\t 01014" + "\t\t   9214 \n\nDIRECCION: " + Mdireccion);
        
        if (tarjeta.length() >= 14) {
            String ultimosCuatro = tarjeta.substring(tarjeta.length() - 4);
            String enmascarado = "*".repeat(tarjeta.length() - 4) + ultimosCuatro;
            System.out.println("\nNRO. DE TARJETA: " + enmascarado);
        } else {
            System.out.println("\nNRO. DE TARJETA: incorrecto");
        }
        
        System.out.println("\nCARGA MONEDERO\n\nNOMBRE DEL TITULAR \t: " + Mnombre + "\nIMPORTE CARGADO \t: " + importe + " " + Mmoneda + "\nSALDO INICIAL \t\t: " + saldoinicial + " " + Mmoneda + "\nSALDO FINAL \t\t: " + saldofinal + " " + Mmoneda + "\n\n\t*GRACIAS POR SU VISITA***");
        
        lector.close();
    }
}