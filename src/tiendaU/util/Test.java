package tiendaU.util;

import java.util.List;

import tiendaU.dao.ClienteDao;
import tiendaU.dao.ServicioDao;
import tiendaU.dao.TiendaDao;
import tiendaU.model.Cliente;
import tiendaU.model.Servicio;
import tiendaU.model.Tienda;

public class Test {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.setNombre("test1234");
		c.setEmail("test@test2132.com");
		c.setClave("123456");
		ClienteDao cdao = new ClienteDao();
		cdao.insert(c);

		
		Tienda t = new Tienda();
		t.setNombre("alkosto");
		t.setLema("alkosto black friday");
		t.setDescripcion("descuentos");
		t.setEmail("alkosto@alkosto.com");
		t.setClave("1234");
		t.setPropietario("jefe");
		t.setFacebook("https://www.facebook.com/alkostohiperahorro");
		t.setWeb("alkosto.com");
		t.setImagen("https://upload.wikimedia.org/wikipedia/commons/4/4d/Logo_alkosto.JPG");
		TiendaDao tdao = new TiendaDao();
		tdao.insert(t);

		
		Servicio s = new Servicio();
		s.setNombre("servicio test");
		s.setDescripcion("test servicio xd");
		s.setTiendaBean(t);
		ServicioDao sdao = new ServicioDao();
		sdao.insert(s);

		
		ClienteDao dao2 = new ClienteDao();
		Cliente prueba2 = dao2.find(2);
		TiendaDao dao = new TiendaDao();
		Tienda prueba = dao.find(1);
		List<Cliente> clientes = prueba.getClientes();
		clientes.add(prueba2);
		prueba.setClientes(clientes);
		dao.update(prueba);

		
		TiendaDao actualizarDao = new TiendaDao();
		Tienda actualizar = actualizarDao.find(3);
		actualizar.setEmail("editado@mail.com");
		actualizarDao.update(actualizar);
	}

}
