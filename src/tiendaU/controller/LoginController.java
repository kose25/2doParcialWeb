package tiendaU.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tiendaU.dao.TiendaDao;
import tiendaU.model.Tienda;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		String accion = request.getParameter("accion");
		switch (accion) {
		case "ingreso":
			
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			TiendaDao tD = new TiendaDao();
			Tienda t = new Tienda();
			t=tD.validar1(email, pass);
			if (t!=null ) {
				sesion.setAttribute("tienda", t);
				request.getRequestDispatcher("JSP/servicios.jsp").forward(request, response);
				
			}else {
				
				request.getRequestDispatcher("JSP/login.jsp").forward(request, response);
				
				
			}
			
			
			break;

		default:
			break;
		}
	}

}
