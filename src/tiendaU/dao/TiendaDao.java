package tiendaU.dao;

import tiendaU.model.Servicio;
import tiendaU.model.Tienda;
import tiendaU.util.Conexion;

import javax.persistence.Query;


public class TiendaDao extends Conexion <Tienda> 
implements GenericDao <Tienda> {
	
	public TiendaDao() {
		super(Tienda.class);		
	}
	
	
//	public Tienda validar(String email, String pass) {
//		Tienda t = new Tienda();
//		 Query nativeQuery = em.createNativeQuery("SELECT id,nombre FROM Tienda p "
//		 		                                 + "WHERE p.email =? "
//		 		                                 + "and p.clave= ? "
//		 		                                 );
//	        nativeQuery.setParameter(1, email);
//	        nativeQuery.setParameter(2, pass);
//	        Object[] result = (Object[]) nativeQuery.getSingleResult();
//	        t.setId((Integer)(result[0]));
//	        t.setNombre((String) result[1]);
//	        //t.setEdad((Integer) result[1]);
//	        //System.out.println(p.getNombre());
//	        //System.out.println(p.getEdad());
//	       
//	
//		return t;
//	}
	
	public Tienda validar1(String email, String clave) {
		
		Tienda t = (Tienda)this.getEm().createQuery("SELECT e FROM Tienda e where email=:email and clave=:clave")
				.setParameter("email", email)
				.setParameter("clave", clave)
				.getSingleResult();
		
		return t;
	}

}
