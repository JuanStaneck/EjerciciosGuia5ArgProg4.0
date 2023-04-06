/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia5javaini;
import java.time.LocalDate;


/**
 *
 * @author Administrador
 */
public class Carrito {
    private Persona Persona;
    private Producto Producto1;
    private Producto Producto2;
    private Producto Producto3;
    private Double costoFinal;

    public Carrito(Persona Persona, Producto Producto1, Producto Producto2, Producto Producto3) {
        this.Persona = Persona;
        this.Producto1 = Producto1;
        this.Producto2 = Producto2;
        this.Producto3 = Producto3;
        
        
    }

    public Persona getPersona() {
        return Persona;
    }

    public Producto getProducto1() {
        return Producto1;
    }

    public Producto getProducto2() {
        return Producto2;
    }

    public Producto getProducto3() {
        return Producto3;
    }

    
    
    
    public void mostrar() {
        System.out.println("Persona: " + Persona.getNombreP());
        System.out.println("DNI: " + Persona.getDocumento());
        System.out.println("Producto 1: " + Producto1.getNombre());
        System.out.println("Producto 2: " + Producto2.getNombre());
        System.out.println("Producto 3: " + Producto3.getNombre());
        System.out.println("");
        
}

    public double costoFinal() {
        return Producto1.getPrecio()*Producto1.cantidad+Producto2.getPrecio()*Producto2.cantidad+Producto3.getPrecio()*Producto3.cantidad;
    }
    public double costoFinalConDesc(){
        double resultado=costoFinal();
        if (Persona.getDocumento()<10000000){
            resultado=costoFinal()*0.7;}
        else if (Persona.getDocumento()<20000000){
            resultado=costoFinal()*0.9;}
        return resultado;
}  
}