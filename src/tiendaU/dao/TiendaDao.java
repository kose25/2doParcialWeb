package tiendaU.dao;

import tiendaU.model.Servicio;
import tiendaU.model.Tienda;
import tiendaU.util.Conexion;

public class TiendaDao extends Conexion <Tienda> 
implements GenericDao <Tienda> {
	
	public TiendaDao() {
		super(Tienda.class);
	}

}
