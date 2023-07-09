package modulo5.Modelo;

public class Profesional extends Usuario {
        private int aniosExperiencia;
        private String departamento;

    public Profesional() {
    }

    public Profesional(int id, String nombre, String tipo, int aniosExperiencia, String departamento) {
        super(id, nombre, tipo);
        this.aniosExperiencia = aniosExperiencia;
        this.departamento = departamento;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "aniosExperiencia=" + aniosExperiencia +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
