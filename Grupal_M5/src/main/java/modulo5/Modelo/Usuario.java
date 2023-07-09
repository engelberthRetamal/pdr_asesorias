package modulo5.Modelo;

public class Usuario {
	private int id;
    private String nombre;
    private String tipo;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        setTipo(tipo);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        // Verificar que el tipo ingresado sea uno de los tres permitidos
        if (tipo.equals("Cliente") || tipo.equals("Administrativo") || tipo.equals("Profesional")) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("Tipo de usuario inválido. Los tipos permitidos son: cliente, administrativo, profesional");
        }
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
