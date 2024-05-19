/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer_6_ed;

/**
 *
 * @author carmen_gordo
 */
public class CalculadoraDeDescuentos {
    
    private static final double descuentaMinTres = 0.8;
    private static final double descuentaMaxTres = 0.95;
    
    public void calcularPrecioFinal(double precioProducto, int numProductos) {
        double total;
        
        if(numProductos > 3) {
            precioProducto -= 5;
        }
        
        if (numProductos != 0) {
            total = calcularDescuento(precioProducto, descuentaMinTres);
        } else {
            total = calcularDescuento(precioProducto, descuentaMaxTres);
        }
        
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
    
    private double calcularDescuento(double precioProducto, double descuento) {
        return precioProducto * descuento;
    }
}