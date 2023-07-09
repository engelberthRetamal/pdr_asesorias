package modulo5.Interfaces;

import java.util.List;

import modulo5.Modelo.Capacitacion;

public interface ICapacitacionDao {
    public void crear(Capacitacion c);
    public void modificar(Capacitacion c);
    public void eliminar(Capacitacion c);
    public List<Capacitacion> listar();
    public Capacitacion buscar(Capacitacion c);

}
