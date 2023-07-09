package modulo5.Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.script.ScriptContext;

import org.apache.jasper.tagplugins.jstl.core.Out;

import modulo5.Modelo.Capacitacion;
import modulo5.Implementacion.CapacitacionDaoImpl;

/**
 * Servlet implementation class CrearCapacitacion
 */
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
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
			
			getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String nombre = request.getParameter("nombre");
		String detalle = request.getParameter("detalle");

		// Crear el objeto Capacitacion con los datos recibidos
		Capacitacion capacitacion = new Capacitacion();
		capacitacion.setNombre(nombre);
		capacitacion.setDetalle(detalle);

		CapacitacionDaoImpl capacitacionDao = new CapacitacionDaoImpl();

		try {
			// Agregar el objeto a la base de datos
			capacitacionDao.crear(capacitacion);
			System.out.println("Registro creado correctamente");
			
			request.getRequestDispatcher("Success?tipo=Capacitacion creada").forward(request, response);


		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al crear el registro");
			System.out.println(e.getMessage());
		}



	}

}
