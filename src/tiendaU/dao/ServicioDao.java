package tiendaU.dao;

import tiendaU.model.Cliente;
import tiendaU.model.Servicio;
import tiendaU.util.Conexion;

public class ServicioDao extends Conexion <Servicio> 
implements GenericDao <Servicio> {
	
	public ServicioDao() {
		super(Servicio.class);
	}

}
