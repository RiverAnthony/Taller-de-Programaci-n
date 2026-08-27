package com.mycompany.boleta;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-TACNA
 */
public class Boleta {

    public static void main(String[] args) {
        Scanner lector =new Scanner(System.in);
        
        String g = "##########################";
        
        String nombre;
        
        double precio1, precio2, subtotal1, subtotal2, total;
        
        int cantidad1, cantidad2;
        
        System.out.println("Ingrese el nombre del cliente");
        
        nombre = lector.nextLine();
        
        System.out.println("Ingrese su producto");
        
        String producto1 = lector.nextLine();
        
        System.out.println("Ingrese el precio");
        
        precio1 = lector.nextDouble();
        
        System.out.println("Ingrese la cantidad");        
        
        cantidad1 = lector.nextInt();
        
        System.out.println("Ingrese su producto");
        
        String producto2 = lector.nextLine();
        
        System.out.println("Ingrese el precio");
        
        precio2 = lector.nextDouble();

        System.out.println("Ingrese la cantidad");        
        
        cantidad2 = lector.nextInt();
        
        if (producto1.contains("GAMER")){
        	subtotal1 = precio1 * cantidad1 * 0.98;
        	} else {
        		subtotal1 = precio1 * cantidad1;
        	}
        
        if (producto2.contains("GAMER")){
        	subtotal2 = precio2 * cantidad2 * 0.98;
        	} else {
        		subtotal2 = precio2 * cantidad2;
        	}
        	
        total = subtotal1 + subtotal2;
        
    
        System.out.println("\t" + g +  "\n\t\tTIENDA ABC \n" + "\t" + g + "\n\tID: 0000252145 \n\n\t\tCOMPRAS"
                + "\n\t AV. SAENZ PENA 376 \n\t\tCHICLAYO \n\t LOTE: B\tTERM: 5268" + "\n\t" + g);
        
        System.out.println("\n\tVEND: JUAN \tCLI: " + nombre + "\n" + g);
        
        System.out.println(cantidad1 + "\t" + producto1 + "\t" + subtotal1);
        
        System.out.println(cantidad2 + "\t" + producto2 + "\t" + subtotal2);
    }
}