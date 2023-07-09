package modulo5.Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modulo5.Modelo.Administrativo;
import modulo5.Modelo.Cliente;
import modulo5.Modelo.Profesional;
import modulo5.Modelo.Usuario;
import modulo5.Implementacion.UsuarioDAOImpl;

import java.io.IOException;


/**
 * Servlet implementation class CrearUsuario
 */
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
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


			getServletContext().getRequestDispatcher("/views/crearUsuario.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String tipo = request.getParameter("tipo");

		if (tipo.equals("Cliente")) {
			String direccion = request.getParameter("direccion");
			int telefono = Integer.parseInt(request.getParameter("telefono"));
			int cantidadEmpleados = Integer.parseInt(request.getParameter("empleados"));

			// Crear un objeto Cliente con los datos recibidos
			Cliente cliente = new Cliente();
			cliente.setNombre(nombre);
			cliente.setTipo(tipo);
			cliente.setDireccion(direccion);
			cliente.setTelefono(telefono);
			cliente.setCantidadEmpleados(cantidadEmpleados);

			UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
			try {
				// Agregar el objeto Cliente a la base de datos
				usuarioDao.crear(cliente);
				System.out.println("Registro de cliente creado correctamente");

				// Redireccionar a la página de éxito
				request.getRequestDispatcher("/ListarUsuario").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error al crear el registro de cliente");

				// Redireccionar a la página de error
				response.sendRedirect(request.getContextPath() + "/error.jsp");
			}
		}

		if (tipo.equals("Profesional")){
			System.out.println("estoy aqui!!!!");
			int aniosExperiencia = Integer.parseInt(request.getParameter("experiencia"));
			String departamento = request.getParameter("departamento");

			Profesional profesional = new Profesional();
			profesional.setNombre(nombre);
			profesional.setTipo(tipo);
			profesional.setAniosExperiencia(aniosExperiencia);
			profesional.setDepartamento(departamento);

			UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
			try {
				// Agregar el objeto Cliente a la base de datos
				usuarioDao.crear(profesional);
				System.out.println("Registro de cliente creado correctamente");

				// Redireccionar a la página de éxito
				request.getRequestDispatcher("/ListarUsuario").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error al crear el registro de cliente");

				// Redireccionar a la página de error
				response.sendRedirect(request.getContextPath() + "/error.jsp");
			}


		}

		if (tipo.equals("Administrativo")) {
			String cargo = request.getParameter("cargo");
			String nombreSupervisor = request.getParameter("superior");

			Administrativo administrativo = new Administrativo();
			administrativo.setNombre(nombre);
			administrativo.setTipo(tipo);
			administrativo.setCargo(cargo);
			administrativo.setNombreSupervisor(nombreSupervisor);

			UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
			try {
				// Agregar el objeto Cliente a la base de datos
				usuarioDao.crear(administrativo);
				System.out.println("Registro de cliente creado correctamente");

				// Redireccionar a la página de éxito
				request.getRequestDispatcher("Success?tipo=Usuario creado").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error al crear el registro de cliente");

				// Redireccionar a la página de error
				response.sendRedirect(request.getContextPath() + "/error.jsp");
			}



		}




	}

}
