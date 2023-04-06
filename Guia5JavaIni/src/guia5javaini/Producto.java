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
public class Producto {
    private String nombre;
    private String marca;
    private LocalDate fechaAlta;
    private Double pesoKg;
    private Double precio;
    public Integer cantidad;

    public Producto(String nombre, String marca, Double pesoKg, Double precio, Integer cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.fechaAlta = LocalDate.now();
        this.pesoKg = pesoKg;
        this.precio = precio;
        this.cantidad = cantidad;
            }

    public Producto(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Fecha de compra: " + fechaAlta);
        System.out.println("Peso en Kg: " + pesoKg);
        System.out.println("Precio: " + precio);
        System.out.println("");
    }
}
    