package ejercicio.funcional.java;

public class Dimension {

    // Atributos
    private double alto;
    private double ancho;
    private double profundidad;
    private double volMax;

    // Constructores
    public Dimension() {
        this.alto = 0.0;
        this.ancho = 0.0;
        this.profundidad = 0.0;
    }
    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    // Setters and getters

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getVolMax() {
        return volMax;
    }

    public void setVolMax(double volMax) {
        this.volMax = volMax;
    }

    // Métodos
    public double getVolumen() {
        this.volMax = this.alto * this.ancho * this.profundidad;
        return volMax;
    }

    @Override
    public String toString() {
        return "Dimension: {" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", volumen max=" + volMax +
                '}';
    }
}
