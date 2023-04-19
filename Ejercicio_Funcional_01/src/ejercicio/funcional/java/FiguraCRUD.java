package ejercicio.funcional.java;

public interface FiguraCRUD {

    // Métodos modificadores
    void addFigura(Figura figura);
    void subirPrecio(double cantidad, String id);
    // Métodos observadores
    Figura masValioso();
    double getValorColeccion();
    double getVolumenColeccion();
    String conCapa();
}
