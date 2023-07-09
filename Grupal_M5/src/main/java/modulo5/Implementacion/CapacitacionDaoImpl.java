package modulo5.Implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modulo5.Interfaces.ICapacitacionDao;
import modulo5.Modelo.Capacitacion;

public class CapacitacionDaoImpl implements ICapacitacionDao {
	private Connection conexion = null;

    @Override
    public void crear(Capacitacion c) {
        String sql= "INSERT INTO Capacitaciones (nombre,detalle) VALUES (?,?)";
        try {
                conexion = Conexion.getConn();
                PreparedStatement ppStm = conexion.prepareStatement(sql);
                ppStm.setString(1, c.getNombre());
                ppStm.setString(2, c.getDetalle());
                
                System.out.println("Nombre capacitacion: "+c.getNombre());
                System.out.println("Detalle capacitacion: "+c.getDetalle());

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
    public void modificar(Capacitacion c) {

    }

    @Override
    public void eliminar(Capacitacion c) {

    }

    @Override
    public List<Capacitacion> listar() {
        String sql = "SELECT id,nombre,detalle FROM Capacitaciones;";
        ArrayList<Capacitacion> todos= new ArrayList<Capacitacion>();
        try{
            conexion = Conexion.getConn();
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                todos.add(new Capacitacion (rs.getInt("id"),rs.getString("nombre"),rs.getString("detalle")));
            }
            stm.close();
            rs.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }


        return todos;
    }

    @Override
    public Capacitacion buscar(Capacitacion c) {
        return null;
    }
}
