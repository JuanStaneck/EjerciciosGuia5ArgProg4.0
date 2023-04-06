/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia5javaini;

/**
 *
 * @author Administrador
 */
public class Persona {
    String nombreP;
    Integer documento;

    public Persona(String nombreP, Integer documento) {
        this.nombreP = nombreP;
        this.documento = documento;
    }

    public String getNombreP() {
        return nombreP;
    }

    public Integer getDocumento() {
        return documento;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombreP);
        System.out.println("DNI: " + documento);
        System.out.println("");
    }
    
}
