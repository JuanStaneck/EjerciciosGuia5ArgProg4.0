/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia5javaini;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Guia5Ej2 {

    public static void main(String[] args) throws IOException {
        String archivo = "E:\\JUAN\\Facultad\\Programacion\\Desarrollador Java Inicial UTN\\guia5ej2.csv";
        List<String> archivoLista;
        archivoLista = Files.readAllLines(Paths.get(archivo));
        System.out.println(archivoLista);
        String rotulos=archivoLista.get(0);
        System.out.println(rotulos);
        String[] productoString= new String [4];
        for (int i=1; i<archivoLista.size(); i++){
           productoString[i] = archivoLista.get(i);
           System.out.println(productoString[i]);
        }
        String[] producto4= new String [3];
        producto4=productoString[1].split(";");
        String[] producto5= new String [3];
        producto5=productoString[2].split(";");
        String[] producto6= new String [3];
        producto6=productoString[3].split(";");
                     
        Producto prod4= new Producto(producto4[2], "", 0.5, Double.parseDouble(producto4[1]), Integer.valueOf(producto4[0]));
        Producto prod5= new Producto(producto5[2], "", 0.5, Double.parseDouble(producto5[1]), Integer.valueOf(producto5[0]));
        Producto prod6= new Producto(producto6[2], "", 0.5, Double.parseDouble(producto6[1]), Integer.valueOf(producto6[0]));
        Persona nadie= new Persona ("nadie,", 0);
                      
        Carrito carEj2= new Carrito(nadie, prod4, prod5, prod6);
        
        System.out.println(carEj2.costoFinal());
    }
}
