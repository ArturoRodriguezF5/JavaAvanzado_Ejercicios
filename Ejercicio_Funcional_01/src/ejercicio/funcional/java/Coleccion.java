package ejercicio.funcional.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Coleccion implements FiguraCRUD{

    // Propiedades
    private String nombreColeccion;
    private ArrayList<Figura> figuras = new ArrayList<>();

    public Coleccion(){
    }
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.figuras = new ArrayList<>();
    }
    // Métodos getters y setters

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    //Métodos
    @Override
    public void addFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    public void subirPrecio(double cantidad, String id) {
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i).getCodigo().equals(id)) {
                figuras.get(i).setPrecio(cantidad + figuras.get(i).getPrecio());
            }
        }
    }

    @Override
    public Figura masValioso() {

        ArrayList<Double> precios = new ArrayList<>();
        for (int i = 0; i < figuras.size(); i++) {
            precios.add(figuras.get(i).getPrecio());
        }
        double mayorPrecio = Collections.max(precios);
        for (Figura fig : figuras) {
            if (fig.getPrecio() == mayorPrecio) {
                return fig;
            }
        }
        return null;
    }

    @Override
    public double getValorColeccion() {
        double precioTotal = 0;
        for (Figura fig : figuras) {
            precioTotal += fig.getPrecio();
        }
        return precioTotal;
    }

    @Override
    public double getVolumenColeccion() {
        double volTotal = 0;
        for (Figura fig : figuras) {
            volTotal += fig.getDimensiones().getVolumen();
        }
        return volTotal + 200;
    }

    @Override
    public String conCapa() {
        String listado= "";
        for (int i = 0; i < figuras.size(); i++) {
            if (figuras.get(i).getSuperHeroe().isCapa()) {
                listado += " " + figuras.get(i).getSuperHeroe().getNombre();
            }
        }
        return listado;
    }

    @Override
    public ArrayList<Figura> verFiguras() {
        return figuras;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", figuras=" + figuras +
                '}';
    }
}
