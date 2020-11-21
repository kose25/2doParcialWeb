package tiendaU.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String clave;

	private String email;

	private String nombre;
	
	//bi-directional many-to-many association to Tienda
		@ManyToMany(mappedBy="clientes")
		private List<Tienda> tiendas;
		
		
		

	public List<Tienda> getTiendas() {
			return tiendas;
		}

		public void setTiendas(List<Tienda> tiendas) {
			this.tiendas = tiendas;
		}

	public Cliente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}