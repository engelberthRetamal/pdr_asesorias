package modulo5.Controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.Serial;
import java.util.List;

import modulo5.Implementacion.UsuarioDAOImpl;
import modulo5.Interfaces.IUsuarioDao;
import modulo5.Modelo.Usuario;

/**
 * Servlet implementation class ListarUsuario
 */
public class ListarUsuario extends HttpServlet {
	@Serial
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuario() {
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
            IUsuarioDao usuarioDao = new UsuarioDAOImpl();
            List<Usuario> usuarios = usuarioDao.listar();

            request.setAttribute("usuarios", usuarios);

            // Redireccionar a la vista ListarUsuarios
            getServletContext().getRequestDispatcher("/views/listarUsuario.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
