/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaClientesMain;

import java.util.ArrayList;

/**
 * Fachada de Sistema
 * Se conecta con ControlClientes para realizar operaciones
 * @author GSilva
 */
public class Sistema {

    private static final Sistema instancia = new Sistema();
    private final ControlClientes controlCliente = new ControlClientes();

    private Sistema() {
    }

    public static Sistema getInstancia() {
        return instancia;
    }

    public boolean AgregarCliente(String nombreNuevo, String apellidoNuevo) {
        return controlCliente.AgregarCliente(nombreNuevo, apellidoNuevo);
    }

    public Cliente BuscarCliente(int id) {
        return controlCliente.BuscarCliente(id);
    }

    public boolean EliminarCliente(int id) {
        return controlCliente.EliminarCliente(id);
    }

    public boolean ModificarCliente(int id, String nombreNuevo, String apellidoNuevo) {
        return controlCliente.ModificarCliente(id, nombreNuevo, apellidoNuevo);
    }

    public ArrayList<Cliente> ListarClientes() {
        return controlCliente.ListarClientes();
    }

}
