package ec.edu.ups.negocio;

import java.util.List;

import javax.ejb.Remote;

import ec.edu.ups.modelo.Cliente;

@Remote
public interface ClienteONRemoto {

	public void guardarContacto(Cliente cliente) throws Exception;
	public Cliente obtenerCedula(String cedula);
	public List<Cliente> listaCliente();
	public boolean validarCedula(String ced);
}
