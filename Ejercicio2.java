package com.mycompany.boleta;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author ANTHONY RIVERA SIÑA
 */
public class Boleta {

    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        
        LocalDateTime ahora = LocalDateTime.now();
        
        String g = "#####################################";
        
        String nombre;
        
        double precio1, precio2, subtotal1, subtotal2, total;
        
        int cantidad1, cantidad2;
        
        System.out.println("Ingrese el nombre del cliente");
        
        nombre = lector.nextLine();
        String Mnombre = nombre.toUpperCase();
        
        System.out.println("Ingrese su producto");
        
        String producto1 = lector.nextLine();
        String Mproducto1 = producto1.toUpperCase();
        
        System.out.println("Ingrese el precio");
        
        precio1 = lector.nextDouble();
        
        System.out.println("Ingrese la cantidad");        
        
        cantidad1 = lector.nextInt();
        
        lector.nextLine();
        
        System.out.println("Ingrese su producto");
        
        String producto2 = lector.nextLine();
        String Mproducto2 = producto2.toUpperCase();
        
        System.out.println("Ingrese el precio");
        
        precio2 = lector.nextDouble();

        System.out.println("Ingrese la cantidad");        
        
        cantidad2 = lector.nextInt();
        
        if (Mproducto1.contains("GAMER")){
        	subtotal1 = precio1 * cantidad1 * 0.98;
        	} else {
        		subtotal1 = precio1 * cantidad1;
        	}
        
        if (Mproducto2.contains("GAMER")){
        	subtotal2 = precio2 * cantidad2 * 0.98;
        	} else {
        		subtotal2 = precio2 * cantidad2;
        	}
        	
        if (Mnombre.equals("JUAN") || Mnombre.equals("ANA")){
        	total = (subtotal1 + subtotal2) * 0.95;
        	} else {
        		total = subtotal1 + subtotal2;
        	}
        
       DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("ddMMMyy", new Locale("es", "ES"));
       
        String fechaStr = ahora.format(formatoFecha);
               
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        
        String horaStr = ahora.format(formatoHora);
        
        System.out.println("\t" + g +  "\n\t\t\t\b\bTIENDA ABC \n" + "\t" + g + "\n\tID: 0000252145 \n\n\t\t\t\bCOMPRAS"
                + "\n\t\t\b  AV.  SAENZ  PENA  376 \n\t\t\t\bCHICLAYO \n\t\t\b LOTE: B    TERM: 5268" + "\n\t" + g);
        
        System.out.println("\tFECHA: " + fechaStr + "\t\tHORA: " + horaStr + "\n\tVEND: JUAN \t\tCLI: " + Mnombre + "\n\t" + g);
        
        System.out.println("\t" + cantidad1 + " " + Mproducto1 + "\t" + "(" + subtotal1 + ")");
        
        System.out.println("\n\t" + cantidad2 + " " + Mproducto2 + "\t" + "(" + subtotal2 + ")");
        
        System.out.println("\n\tPAGO TOTAL: S/. " + total + "\n\n\t" + g + "\n\tVUELVA PRONTO! \n\t" + g);
    }
}