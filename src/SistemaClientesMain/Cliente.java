/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaClientesMain;

/**
 * Clase Cliente
 * @author GSilva
 */
public class Cliente {
    int idCliente;
    String nombre;
    String apellido;

    public Cliente(int idNuevo, String nombreNuevo, String apellidoNuevo) {
        idCliente= idNuevo;
        nombre= nombreNuevo;
        apellido= apellidoNuevo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
