package tiendaU.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tiendaU.dao.TiendaDao;
import tiendaU.model.Tienda;

/**
 * Servlet implementation class TiendaController
 */
@WebServlet("/TiendaController")
public class TiendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TiendaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");

		switch (accion) {
		case "registro":
			String nombre = request.getParameter("nombre");
			String lema = request.getParameter("lema");
			String descripcion = request.getParameter("descripcion");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			String propietario = request.getParameter("propietario");
			String facebook = request.getParameter("facebook");
			String web = request.getParameter("propietario");
			String imagen = request.getParameter("web");

			TiendaDao tD = new TiendaDao();
			Tienda t = new Tienda();
			t.setNombre(nombre);
			t.setLema(lema);
			t.setDescripcion(descripcion);
			t.setEmail(email);
			t.setClave(pass);
			t.setPropietario(propietario);
			t.setFacebook(facebook);
			t.setWeb(web);
			t.setImagen(imagen);
			tD.insert(t);
			request.getRequestDispatcher("index.jsp").forward(request, response);

			break;
		}
	}

}
