package ejercicio.funcional.java;

import java.util.ArrayList;

public class Coleccion implements FiguraCRUD{

    // Propiedades
    private String nombreColeccion;
    private ArrayList<Figura> figuras;

    public Coleccion(){
    }
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.figuras = new ArrayList<Figura>();
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
        this.figuras.add(figura);
    }

    @Override
    public void subirPrecio(double cantidad, String id) {
        for (int i = 0; i < figuras.size() - 1; i++) {
            if (figuras.get(i).getCodigo().equals(id)) {
                figuras.get(i).setPrecio(cantidad);
            }
        }
    }

    @Override
    public Figura masValioso() {
        return null;
    }

    @Override
    public double getValorColeccion() {
        return 0;
    }

    @Override
    public double getVolumenColeccion() {
        return 0;
    }

    @Override
    public String conCapa() {
        String listado = "";
        for (int i = 0; i < figuras.size() - 1; i++) {
            if (figuras.get(i).getSuperHeroe().isCapa()) {
                listado += figuras.get(i).getSuperHeroe().getNombre();
            }
        }
        return listado;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", figuras=" + figuras +
                '}';
    }
}
