/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Steffany
 */
public class TrabajoFinalLogica {
    
    static Scanner sc = new Scanner (System.in);
        
    static ArrayList<String> names = new ArrayList<String>();
        
    static String rta;
    
    static int opc;
    
    public static void main (String [] args){
        
        //Crear una funcionalidad que agregue nombres a un ArrayList de manera dinámica, preguntando si desea agregar
        //un nuevo nombre, además debe imprimir el listado de nombres indicando nombre #, y debe permitir salir de la 
        //funcionalidad. Crear menú, llamar todo en una función, opc de agregar nombres y ejecutar do while preguntando 
        //si quiere agregar otro nombre y si dice que no el for lo devuelve a menú y le pregunta si quiere mostrar 
        //nombres. Usar While, Switch, Do While, For. 
        
        do {
            menu();    
        }while(opc != 3);
            
    }
    
    //-----------MENÚ-------------//
    
    public static void menu(){
        
        System.out.println("\nEscoja una opción:\n 1. Ingresar nombres\n 2. Mostrar nombres\n 3. Salir ");
        opc = sc.nextInt();
        sc.nextLine();
                  
        switch (opc){
            
            case 1:
                
                do {
                    System.out.println("Ingrese un nombre");
                    String nombre = sc.nextLine();
                    names.add(nombre);
                    System.out.println("¿Desea agregar otro nombre? Si No");
                    rta = sc.nextLine();
                }while(rta.toUpperCase().equals ("SI"));
                for (rta = "SI"; rta.toUpperCase().equals ("NO"); menu()){
                    
                }                
                break;
                
            case 2:
                for (int i=0; i<names.size(); i++){
                    String nombre = names.get(i);
                    System.out.println("\nEl nombre en la posicion " + i + " es " + nombre);
                }
                break;
                //for (String nombre : names){
                //    System.out.println(nombre);
                //}
                
            case 3:
                System.out.println("Salir");
                //System.exit(0);
                break;
                
            default:
                System.out.println("Ingrese una opción válida");
                
        }  
    }
}
        
        
        

