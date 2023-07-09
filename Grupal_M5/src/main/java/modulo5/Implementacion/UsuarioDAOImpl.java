package modulo5.Implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modulo5.Interfaces.IUsuarioDao;
import modulo5.Modelo.Administrativo;
import modulo5.Modelo.Cliente;
import modulo5.Modelo.Profesional;
import modulo5.Modelo.Usuario;

public class UsuarioDAOImpl implements IUsuarioDao{
	 private Connection conexion = null;

	    @Override
	    public void crear(Usuario u) {
			String sql = "INSERT INTO Usuarios (nombre, tipo, direccion, telefono, cantidadEmpleados) VALUES (?, ?, ?, ?, ?)";
	        try {
	            conexion = Conexion.getConn();
	            PreparedStatement ppStm = conexion.prepareStatement(sql);
	            ppStm.setString(1, u.getNombre());
	            ppStm.setString(2, u.getTipo());



	            if (!ppStm.execute()) {
	                System.out.println("Registro Creado");
	            } else {
	                System.out.println("Registro No Creado");
	            }
	            ppStm.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	    }

	@Override
	public void crear(Cliente c) {
		String sql = "INSERT INTO Usuarios (nombre, tipo, direccion, telefono, cantidadEmpleados) VALUES (?, ?, ?, ?, ?)";
		try {
			conexion = Conexion.getConn();
			PreparedStatement ppStm = conexion.prepareStatement(sql);
			ppStm.setString(1, c.getNombre());
			ppStm.setString(2, c.getTipo());
			ppStm.setString(3, c.getDireccion());
			ppStm.setInt(4, c.getTelefono());
			ppStm.setInt(5, c.getCantidadEmpleados());

			if (!ppStm.execute()) {
				System.out.println("Registro Creado");
			} else {
				System.out.println("Registro No Creado");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}



	}

	@Override
	public void crear(Administrativo a) {
		String sql = "INSERT INTO Usuarios (nombre, tipo, cargo, nombreSuperior) VALUES (?, ?, ?, ?)";
		try {
			conexion = Conexion.getConn();
			PreparedStatement ppStm = conexion.prepareStatement(sql);
			ppStm.setString(1, a.getNombre());
			ppStm.setString(2, a.getTipo());
			ppStm.setString(3, a.getCargo());
			ppStm.setString(4, a.getNombreSupervisor());


			if (!ppStm.execute()) {
				System.out.println("Registro Creado");
			} else {
				System.out.println("Registro No Creado");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void crear(Profesional p) {
		String sql = "INSERT INTO Usuarios (nombre, tipo, añosExperiencia, departamento) VALUES (?, ?, ?, ?)";
		try {
			conexion = Conexion.getConn();
			PreparedStatement ppStm = conexion.prepareStatement(sql);
			ppStm.setString(1, p.getNombre());
			ppStm.setString(2, p.getTipo());
			ppStm.setInt(3, p.getAniosExperiencia());
			ppStm.setString(4, p.getDepartamento());


			if (!ppStm.execute()) {
				System.out.println("Registro Creado");
			} else {
				System.out.println("Registro No Creado");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	    public void modificar(Usuario u) {
			String sql = "UPDATE Usuarios SET nombre = ?, tipo = ? WHERE id = ?";
		PreparedStatement preparedStatement = null;



		try {
			// Establecer la conexión a la base de datos
			conexion = Conexion.getConn();
			// Preparar la consulta SQL
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1, u.getNombre());
			preparedStatement.setString(2, u.getTipo());
			preparedStatement.setInt(3, u.getId());

			if (!preparedStatement.execute()) {
				System.out.println("Registro Creado");
			} else {
				System.out.println("Registro No Creado");
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

	@Override
	public void modificar(Cliente c) {
		String sql = "UPDATE Usuarios SET nombre = ?, tipo = ?, direccion = ?, telefono = ?, cantidadEmpleados = ? WHERE id = ?";
		try {
			conexion = Conexion.getConn();
			PreparedStatement ppStm = conexion.prepareStatement(sql);
			ppStm.setString(1, c.getNombre());
			ppStm.setString(2, c.getTipo());
			ppStm.setString(3, c.getDireccion());
			ppStm.setInt(4, c.getTelefono());
			ppStm.setInt(5, c.getCantidadEmpleados());
			ppStm.setInt(6, c.getId());

			if (!ppStm.execute()) {
				System.out.println("Registro Modificado");
			} else {
				System.out.println("Registro No Modificado");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modificar(Administrativo a) {
		String sql = "UPDATE Usuarios SET nombre = ?, tipo = ?, cargo = ?, nombreSuperior = ? WHERE id = ?";
		try {
			conexion = Conexion.getConn();
			PreparedStatement ppStm = conexion.prepareStatement(sql);
			ppStm.setString(1, a.getNombre());
			ppStm.setString(2, a.getTipo());
			ppStm.setString(3, a.getCargo());
			ppStm.setString(4, a.getNombreSupervisor());
			ppStm.setInt(5, a.getId());

			if (!ppStm.execute()) {
				System.out.println("Registro Modificado");
			} else {
				System.out.println("Registro No Modificado");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void modificar(Profesional p) {
		String sql = "UPDATE Usuarios SET nombre = ?, tipo = ?, añosExperiencia = ?, departamento = ? WHERE id = ?";
		try {
			conexion = Conexion.getConn();
			PreparedStatement ppStm = conexion.prepareStatement(sql);
			ppStm.setString(1, p.getNombre());
			ppStm.setString(2, p.getTipo());
			ppStm.setInt(3, p.getAniosExperiencia());
			ppStm.setString(4, p.getDepartamento());
			ppStm.setInt(5, p.getId());

			if (!ppStm.execute()) {
				System.out.println("Registro Modificado");
			} else {
				System.out.println("Registro No Modificado");
			}
			ppStm.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	    public void eliminar(Usuario u) {

	    }

	    @Override
	    public List<Usuario> listar() {
	        String sql = "SELECT id,nombre,tipo FROM Usuarios;";
	        ArrayList<Usuario> todos= new ArrayList<>();
	        try{
	            conexion = Conexion.getConn();
	            Statement stm = conexion.createStatement();
	            ResultSet rs = stm.executeQuery(sql);
	            while(rs.next()){
	                todos.add(new Usuario (rs.getInt("id"),rs.getString("nombre"),rs.getString("tipo")));
	            }
	            stm.close();
	            rs.close();
	        }catch (SQLException e) {
	            e.printStackTrace();
	        }


	        return todos;
	    }

	    @Override
	    public Usuario buscar(Usuario u) {
	        return null;
	    }

	@Override
	public Usuario obtenerUsuarioPorId(int idUsuario) {
		Usuario usuario = null;
		String sql = "SELECT * FROM usuarios WHERE id = ?;";

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			// Establecer la conexión a la base de datos
			conexion = Conexion.getConn();

			// Preparar la consulta SQL
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setInt(1, idUsuario);

			// Ejecutar la consulta SQL y obtener el resultado
			resultSet = preparedStatement.executeQuery();

			// Verificar si se encontró el usuario y asignar los datos
			if (resultSet.next()) {
				// Obtener los datos del resultado de la consulta
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String tipo = resultSet.getString("tipo");
				String direccion = resultSet.getString("direccion");
				int telefono = resultSet.getInt("telefono");
				int cantidadEmpleados = resultSet.getInt("cantidadEmpleados");
				int aniosExperiencia = resultSet.getInt("añosExperiencia");
				String departamento = resultSet.getString("departamento");
				String cargo = resultSet.getString("cargo");
				String nombreSuperior = resultSet.getString("nombreSuperior");
				System.out.println(tipo);
				if (tipo.equals("Cliente")){
					Cliente cliente = new Cliente();
					cliente.setNombre(nombre);
					cliente.setTipo(tipo);
					cliente.setDireccion(direccion);
					cliente.setTelefono(telefono);
					cliente.setCantidadEmpleados(cantidadEmpleados);
					usuario = cliente;
				} else if (tipo.equals("Administrativo")){
					Administrativo administrativo = new Administrativo();
					administrativo.setNombre(nombre);
					administrativo.setTipo(tipo);
					administrativo.setCargo(cargo);
					administrativo.setNombreSupervisor(nombreSuperior);
					usuario = administrativo;
				} else if (tipo.equals("Profesional")){
					Profesional profesional = new Profesional();
					profesional.setNombre(nombre);
					profesional.setTipo(tipo);
					profesional.setAniosExperiencia(aniosExperiencia);
					profesional.setDepartamento(departamento);
					usuario = profesional;
				}
				// Crear una instancia de Usuario y asignar los datos

			}


			preparedStatement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}



		return usuario;
	}




}
