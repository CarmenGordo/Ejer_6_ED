/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer_6_ed;

/**
 *
 * @author carmen_gordo
 */
public class Main {
    public static void main(String[] args) {
        CalculadoraDeDescuentos calculadora = new CalculadoraDeDescuentos();
        
        double precioProducto = 100;
        int numProductos = 5;
        
        calculadora.calcularPrecioFinal(precioProducto, numProductos);
    }
}
