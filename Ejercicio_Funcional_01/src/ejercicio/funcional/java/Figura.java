package ejercicio.funcional.java;

public class Figura {

    // Atributos
    private String codigo;
    private double precio;
    private SuperHeroe superHeroe;
    private Dimension dimensiones;

    // Constructores
    public Figura() {
    }
    public Figura(String codigo, double precio, SuperHeroe superHeroe, Dimension dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superHeroe = superHeroe;
        this.dimensiones = dimensiones;
    }
    // Métodos getters y setters


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SuperHeroe getSuperHeroe() {
        return superHeroe;
    }

    public void setSuperHeroe(SuperHeroe superHeroe) {
        this.superHeroe = superHeroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    // Métodos
    public void subirPrecio(double cantidad) {
        this.precio += cantidad;
    }
    @Override
    public String toString() {
        return "Figura: {" +
                "codigo='" + codigo + '\'' +
                ", precio=" + precio +
                ", superHeroe=" + superHeroe +
                ", dimensiones=" + dimensiones +
                '}';
    }
}
