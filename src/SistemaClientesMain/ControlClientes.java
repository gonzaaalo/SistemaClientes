/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaClientesMain;

import java.util.ArrayList;

/**
 * Gestión de Clientes
 * @author GSilva
 */
public class ControlClientes {
    
    private final ArrayList<Cliente> clientes = new ArrayList();

    public ControlClientes(){
    }
    
    public boolean AgregarCliente(String nombreNuevo, String apellidoNuevo){
        int idNuevo=0;
        if(clientes != null) idNuevo=clientes.size() + 1;  
        System.out.println(clientes.size());
        System.out.println(idNuevo+ nombreNuevo+ apellidoNuevo);
        Cliente clienteNuevo= new Cliente(idNuevo, nombreNuevo, apellidoNuevo); 
        clientes.add(clienteNuevo);
        return true;
    }
    
    public Cliente BuscarCliente(int id){
        for(Cliente c: clientes){
            if(c.getIdCliente()== id) return c;
        }
        return null;        
    }
    
    public boolean EliminarCliente(int id){
        Cliente clienteEliminar= BuscarCliente(id);
        if(clienteEliminar != null){
              clientes.remove(clienteEliminar);
              return true;
        }
        return false;
    }
    
    public boolean ModificarCliente(int id, String nombreNuevo, String apellidoNuevo){
        Cliente clienteModificar= BuscarCliente(id);
        if(clienteModificar != null){
              clienteModificar.nombre=nombreNuevo;
              clienteModificar.apellido=apellidoNuevo;
              return true;
        }
        return false;
    }
    
    public ArrayList<Cliente> ListarClientes(){
        return clientes;
    }

}
