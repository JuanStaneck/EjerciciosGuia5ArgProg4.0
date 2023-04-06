/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia5javaini;


/**
 *
 * @author Administrador
 */
public class Guia5Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cargo los productos, puse solo 3. Agrego un producto vacio para llenar el carro con "nada". 
        //Esto podria salvarlo con null, pero lo dejo para mas adelante
        
        Producto prod1= new Producto("Arroz", "Amanda", 0.5, 150.75, 1);
        Producto prod2= new Producto("Fideos", "Luchetti", 0.75, 143.56, 1);
        Producto prod3= new Producto("Azucar", "Ledesma", 1.0, 140.01, 1);
        Producto vacio = new Producto ("null", "null", 0.0, 0.0, 1);
        
        //Cargo las personas. Puse 3, uso solo el DNI para el descuento y no la edad
        Persona per1= new Persona("Carlos", 28012321);
        Persona per2= new Persona("Marta", 19824124);
        Persona per3= new Persona("Susana", 8231513);
        
        //Cargo el carrito. Le puse que tenga solo 3 productos, podria haberle puesto mas. 
        //Tendria que implementar algun array list para que se me llene de productos vacios cuando no se llena totalmente
        Carrito car1= new Carrito(per1, prod1, vacio, vacio);
        Carrito car2= new Carrito(per2, prod1, prod1, prod3);
        Carrito car3= new Carrito(per3, prod3, prod3, prod3);
        
        //Muestro productos
        System.out.println("Producto 1");
        prod1.mostrar();
        System.out.println("Producto 2");
        prod2.mostrar();
        System.out.println("Producto 3");
        prod3.mostrar();
        
        //Muestro info de las personas
        System.out.println("Persona 1");
        per1.mostrar();
        System.out.println("Persona 2");
        per2.mostrar();
        System.out.println("Persona 3");
        per3.mostrar();
        
        //Muestro los carritos con el nombre de la persona, el DNI, los productos y el precio con y sin desc segun el DNI
        System.out.println("Carrito 1");
        car1.mostrar();
        System.out.println(car1.costoFinal());
        System.out.println(car1.costoFinalConDesc());
        System.out.println("Carrito 2");
        car2.mostrar();
        System.out.println(car2.costoFinal());
        System.out.println(car2.costoFinalConDesc());
        System.out.println("Carrito 3");
        car3.mostrar();
        System.out.println(car3.costoFinal());
        System.out.println(car3.costoFinalConDesc());
    }
    
}
