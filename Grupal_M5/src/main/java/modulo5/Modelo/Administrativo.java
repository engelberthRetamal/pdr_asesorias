package modulo5.Modelo;

public class Administrativo extends Usuario {
    private String cargo;
    private String nombreSupervisor;

    public Administrativo() {
    }

    public Administrativo(int id, String nombre, String tipo, String cargo, String nombreSupervisor) {
        super(id, nombre, tipo);
        this.cargo = cargo;
        this.nombreSupervisor = nombreSupervisor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreSupervisor() {
        return nombreSupervisor;
    }

    public void setNombreSupervisor(String nombreSupervisor) {
        this.nombreSupervisor = nombreSupervisor;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargo='" + cargo + '\'' +
                ", nombreSupervisor='" + nombreSupervisor + '\'' +
                '}';
    }
}
