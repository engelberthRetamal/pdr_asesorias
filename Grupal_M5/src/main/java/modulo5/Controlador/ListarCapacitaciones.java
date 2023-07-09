package modulo5.Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modulo5.Modelo.Capacitacion;
import modulo5.Implementacion.CapacitacionDaoImpl;
import modulo5.Interfaces.ICapacitacionDao;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ListarCapacitaciones
 */
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		if (sesion.getAttribute("user") == null) {
			getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
		} else {
			ICapacitacionDao capacitacionDao = new CapacitacionDaoImpl();
			List<Capacitacion> capacitaciones = capacitacionDao.listar();

			request.setAttribute("capacitaciones", capacitaciones);
			
			getServletContext().getRequestDispatcher("/views/listarCapacitaciones.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
