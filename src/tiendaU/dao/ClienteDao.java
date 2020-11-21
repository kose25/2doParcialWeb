package tiendaU.dao;

import java.util.List;

import tiendaU.model.Cliente;
import tiendaU.util.*;

public class ClienteDao extends Conexion <Cliente> 
implements GenericDao <Cliente> {

	public ClienteDao() {
		super(Cliente.class);
	}
	
	

}
