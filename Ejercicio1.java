package com.mycompany.project1;
import java.util.Scanner;
        
/**
 *
 * @author ANTHONY RIVERA SIÑA
 */
 
public class Project1 {

    public static void main(String[] args) {
        
        Scanner lector =new Scanner(System.in);
        
        int dias;

        System.out.println("Ingrese la cantidad de dias");
        
        dias = lector.nextInt();
        
        int seg = dias * 24 * 60 * 60;
        
        final long vluz =299792458;
        
        double total = vluz*seg;
        
        System.out.printf("%.0f\n", total);
        
        
    }
}