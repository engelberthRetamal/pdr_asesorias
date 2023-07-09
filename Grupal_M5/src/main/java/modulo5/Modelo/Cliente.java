package modulo5.Modelo;

public class Cliente extends Usuario{
    private String direccion;
    private int telefono;
    private int cantidadEmpleados;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String tipo, String direccion, int telefono, int cantidadEmpleados) {
        super(id, nombre, tipo);
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", cantidadEmpleados=" + cantidadEmpleados +
                '}';
    }
}
