package com.mycompany.ejercicio4;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 *
 * @author ANTHONY RIVERA SIÑA
 */
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        
        LocalDateTime ahora = LocalDateTime.now();
        
        String g = "----------------------------------------------";
        
        String nombre;
        
        double precio1, precio2, subtotal1, subtotal2, porcentaje, descuento, total, totalfinal;
        
        int telefono, cantidad1, cantidad2;
        
        System.out.println("Ingrese el nombre del cliente");
        
        nombre = lector.nextLine();
        String Mnombre = nombre.toUpperCase();
        
        System.out.println("Ingrese el telefono del cliente");
        
        telefono = lector.nextInt();
        
        lector.nextLine();
        
        System.out.println("Ingrese su producto");
        
        String producto1 = lector.nextLine();
        String Mproducto1 = producto1.toLowerCase();
        
        System.out.println("Ingrese el precio");
        
        precio1 = lector.nextDouble();
        
        System.out.println("Ingrese la cantidad");        
        
        cantidad1 = lector.nextInt();
        
        lector.nextLine();
        
        System.out.println("Ingrese su producto");
        
        String producto2 = lector.nextLine();
        String Mproducto2 = producto2.toLowerCase();
        
        System.out.println("Ingrese el precio");
        
        precio2 = lector.nextDouble();

        System.out.println("Ingrese la cantidad");        
        
        cantidad2 = lector.nextInt();
        
        System.out.println("Ingrese la cantidad de descuento");        
        
        porcentaje = lector.nextInt();
        
        subtotal1 = precio1 * cantidad1;
        		
        subtotal2 = precio2 * cantidad2;  	
        
        total = (subtotal1 + subtotal2);
        
        descuento = total * (porcentaje / 100);
        
        totalfinal = total - descuento;
        
       DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("ddMMMyy", new Locale("es", "ES"));
       
        String fechaStr = ahora.format(formatoFecha);
               
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        
        String horaStr = ahora.format(formatoHora);
        
        System.out.println("\n\t\t\t\b\b500 GRADOS S.A.C. \n\t\t\t 500 GRADOS" + "\n\t\tRUC\t: \t2024234680 \n\t  AV.  CAMINO REAL  1376-LOCAL COMERCIAL 3 \n\t\t - TACNA - TACNA - TACNA \n\t\t\t\b TELEFONO: " + telefono);
        
        System.out.println("\tPEDIDO: 18000141240\n\tFECHA: " + fechaStr + "\n\tHORA: " + horaStr + "\n\tTIPO: En el Local \n\tCAJA: 005 \n\tCLIENTE:"  + Mnombre + " \n\tMESERO: JORGE \n\tDESCUENTO: " + porcentaje + "% \n\tMESA: SALON 200 - MESA 203 Pax" + "\n\t" + g);
        
        System.out.println("\tCantid.\t Producto \t\t SubTotal\n\t" + g + "\n\t" + cantidad1 + "\t " + Mproducto1 + "\t\t\t " + subtotal1);
        
        System.out.println("\n\t" + cantidad2 + "\t " + Mproducto2 + "\t\t\t " + subtotal2 + "\n\t" + g);
        
        System.out.println("\t\t\t Total S/. : " + totalfinal + "\n\n\t" + g + "\n\tVUELVA PRONTO! \n\t" + g);
           
        lector.close();
    }
}