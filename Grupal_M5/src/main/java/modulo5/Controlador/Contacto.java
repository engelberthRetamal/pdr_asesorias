package modulo5.Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Contacto
 */
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
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
			getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		
		if (request.getParameter("nombreContact") == null) {
			response.setContentType("text/html");
			response.addHeader("Refresh", "0; URL=http://localhost:8080/Grupal_M5/Contacto");
		} else {
			
			String nombre = request.getParameter("nombreContact");
			String email = request.getParameter("emailContact");
			String mensaje = request.getParameter("message");
					
			System.out.println(nombre+" "+email+" "+mensaje);
			
			response.setContentType("text/html");
			response.addHeader("Refresh", "0");
			PrintWriter out = response.getWriter();
			out.println("<script> alert('"+nombre+" su mensaje ha sido recibido.'); </script>");
				
		}

	}
}
