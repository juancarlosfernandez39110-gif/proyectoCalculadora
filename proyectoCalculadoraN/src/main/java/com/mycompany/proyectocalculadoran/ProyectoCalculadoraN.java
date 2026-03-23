/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectocalculadoran;

/**
 *
 * @author juanc
 */
public class ProyectoCalculadoraN {

    public static void main(String[] args) {
        System.out.println("=== Calculadora Versión 1.0 ===");
        System.out.println("Desarrollada con Git y GitHub");
        
        // Ejemplo de suma
        int resultado = sumar(5, 3);
        System.out.println("5 + 3 = " + resultado);
        
        // Ejemplo de multiplicación
        int multiplicacion = multiplicar(5, 3);
        System.out.println("5 * 3 = " + multiplicacion);
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
     public static int multiplicar(int a, int b) {
        return a * b;
    }
    }

