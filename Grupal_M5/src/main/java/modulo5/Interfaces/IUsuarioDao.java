package modulo5.Interfaces;

import java.util.List;

import modulo5.Modelo.Administrativo;
import modulo5.Modelo.Cliente;
import modulo5.Modelo.Profesional;
import modulo5.Modelo.Usuario;

public interface IUsuarioDao {
    public void crear (Usuario u);
    public void crear (Cliente c);
    public void crear (Administrativo a);
    public void crear (Profesional p);
    public void modificar(Usuario u);
    public void modificar(Cliente c);
    public void modificar(Administrativo a);
    public void modificar(Profesional p);
    public void eliminar(Usuario u);
    public List<Usuario> listar();
    public Usuario buscar(Usuario u);

    Usuario obtenerUsuarioPorId(int idUsuario);
}
