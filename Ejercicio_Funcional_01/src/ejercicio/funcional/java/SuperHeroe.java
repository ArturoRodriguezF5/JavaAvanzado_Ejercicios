package ejercicio.funcional.java;

public class SuperHeroe {

    // Propiedades
    private String nombre;
    private String descripcion;
    private boolean capa;

    // Constructores
    public SuperHeroe() {}
    public SuperHeroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    // Métodos getter/setter
    public String getNombre () {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isCapa() {
        return this.capa;
    }
    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    // Métodos

    @Override
    public String toString() {
        return "SuperHeroe: {" +
                "nombre= '" + nombre + '\'' +
                ", descripcion= '" + descripcion + '\'' +
                ", capa= " + capa +
                '}';
    }
}
