package modulo5.Controlador;

import jakarta.servlet.RequestDispatcher;
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


public class EditarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idUsuario = Integer.parseInt(request.getParameter("id"));


        UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
        Usuario usuario = usuarioDao.obtenerUsuarioPorId(idUsuario);
        request.setAttribute("usuario", usuario);


        if (usuario != null) {
            // Realizar acciones con los datos obtenidos
            String tipo = usuario.getTipo();
            request.setAttribute("tipoUsuario", tipo);
            request.setAttribute("idUsuario", idUsuario);

            if (tipo.equals("Administrativo")) {
                if (usuario instanceof Administrativo) {
                    Administrativo administrativo = (Administrativo) usuario;
                    int id = idUsuario;
                    String nombre = administrativo.getNombre();
                    String cargo = administrativo.getCargo();
                    String nombreSupervisor = administrativo.getNombreSupervisor();

                    request.setAttribute("idUsuario", id);
                    request.setAttribute("nombreUsuario", nombre);
                    request.setAttribute("cargo", cargo);
                    request.setAttribute("nombreSupervisor", nombreSupervisor);
                }
            } else if (tipo.equals("Cliente")) {
                if (usuario instanceof Cliente) {
                    Cliente cliente = (Cliente) usuario;
                    int id = idUsuario;
                    String nombre = cliente.getNombre();
                    String direccion = cliente.getDireccion();
                    int telefono = cliente.getTelefono();
                    int cantidadEmpleados = cliente.getCantidadEmpleados();
                    // Realizar acciones con los atributos de Cliente
                    request.setAttribute("idUsuario", id);
                    request.setAttribute("nombreUsuario", nombre);
                    request.setAttribute("direccion", direccion);
                    request.setAttribute("telefono", telefono);
                    request.setAttribute("cantidadEmpleados", cantidadEmpleados);
                }
            } else if (tipo.equals("Profesional")) {
                if (usuario instanceof Profesional) {
                    Profesional profesional = (Profesional) usuario;
                    int id = idUsuario;
                    String nombre = profesional.getNombre();
                    int experiencia = profesional.getAniosExperiencia();
                    String departamento = profesional.getDepartamento();
                    // Realizar acciones con los atributos de Profesional
                    request.setAttribute("idUsuario", id);
                    request.setAttribute("nombreUsuario", nombre);
                    request.setAttribute("experiencia", experiencia);
                    request.setAttribute("departamento", departamento);
                }
            }




            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/editarUsuario.jsp");
            dispatcher.forward(request, response);

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idUsuario = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("idUsuario", idUsuario);
        String nuevoTipo = request.getParameter("tipo");
        if(nuevoTipo.equals("Cliente")) {

            String nuevoNombre = request.getParameter("nombre");
            String nuevaDireccion = request.getParameter("direccion");
            int nuevoTelefono = Integer.parseInt(request.getParameter("telefono"));
            int nuevaCantidadEmpleados = Integer.parseInt(request.getParameter("empleados"));

            UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
            Usuario usuario = usuarioDao.obtenerUsuarioPorId(idUsuario);
            String tipoActual = usuario.getTipo();
            if (tipoActual.equals("Cliente")) {
                Cliente cliente = new Cliente();
                cliente.setId(idUsuario);
                cliente.setNombre(nuevoNombre);
                cliente.setTipo(nuevoTipo);
                cliente.setDireccion(nuevaDireccion);
                cliente.setTelefono(nuevoTelefono);
                cliente.setCantidadEmpleados(nuevaCantidadEmpleados);
                usuarioDao.modificar(cliente);
            }
            response.sendRedirect(request.getContextPath() + "/ListarUsuario");
        } else if(nuevoTipo.equals("Administrativo")) {

            String nuevoNombre = request.getParameter("nombre");
            String nuevaDireccion = request.getParameter("direccion");
            String nuevocargo = request.getParameter("cargo");
            String nuevoNombreSuperior = request.getParameter("superior");

            UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
            Usuario usuario = usuarioDao.obtenerUsuarioPorId(idUsuario);
            String tipoActual = usuario.getTipo();

            if (tipoActual.equals("Administrativo")) {
                Administrativo administrativo = new Administrativo();
                administrativo.setId(idUsuario);
                administrativo.setNombre(nuevoNombre);
                administrativo.setTipo(nuevoTipo);
                administrativo.setCargo(nuevocargo);
                administrativo.setNombreSupervisor(nuevoNombreSuperior);
                usuarioDao.modificar(administrativo);
            }
            response.sendRedirect(request.getContextPath() + "/ListarUsuario");
        } else if(nuevoTipo.equals("Profesional")) {

            String nuevoNombre = request.getParameter("nombre");
            String nuevaDireccion = request.getParameter("direccion");
            int nuevoAniosExperiencia = Integer.parseInt(request.getParameter("experiencia"));
            String nuevoDepartamento= request.getParameter("departamento");

            UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
            Usuario usuario = usuarioDao.obtenerUsuarioPorId(idUsuario);
            String tipoActual = usuario.getTipo();
            if (tipoActual.equals("Profesional")) {
                Profesional profesional = new Profesional();
                profesional.setId(idUsuario);
                profesional.setNombre(nuevoNombre);
                profesional.setTipo(nuevoTipo);
                profesional.setAniosExperiencia(nuevoAniosExperiencia);
                profesional.setDepartamento(nuevoDepartamento);
                usuarioDao.modificar(profesional);
            }

            response.sendRedirect(request.getContextPath() + "/ListarUsuario");
        } else {
            // Manejar el caso en el que no se encuentra el usuario en la base de datos
            // Puedes redireccionar a una página de error o mostrar un mensaje de error
        }
    }



}

