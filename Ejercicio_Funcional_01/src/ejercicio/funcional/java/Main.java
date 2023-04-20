package ejercicio.funcional.java;

import java.util.ArrayList;

public class Main {

    // Creamos un objeto tipo CRUD
    public static FiguraCRUD figuraCRUD = new Coleccion();
    public static void main(String[] args) {
        // Creamos objetos de tipo dimension
        SuperHeroe sh1 = new SuperHeroe("Batman");
        SuperHeroe sh2 = new SuperHeroe("SuperMan");
        SuperHeroe sh3 = new SuperHeroe("Hellboy");
        sh1.setCapa(true);
        // Creamos objetos de tipo SuperHeroe
        Dimension dim1 = new Dimension(2, 3, 4);
        Dimension dim2 = new Dimension(3, 5, 5);
        Dimension dim3 = new Dimension(1, 1, 2);

        // Creamos objetos de tipo Figura para meterlos a las colecciones
        Figura fig1 = new Figura("Fig01", 504.2,sh1, dim1);
        Figura fig2 = new Figura("Fig02", 200.4, sh2, dim2);
        Figura fig3 = new Figura("Fig03", 344.8,sh3, dim3);

        figuraCRUD.addFigura(fig1);
        figuraCRUD.addFigura(fig2);
        figuraCRUD.addFigura(fig3);
        // Aumentamos el precio de la fig2 en 1000.0
        figuraCRUD.subirPrecio(1000.0, "Fig02");
        System.out.println("La coleccion contiene estas figuras: " + figuraCRUD.verFiguras());
        System.out.println("El precio total de la colección de las figuras es: " + (float) figuraCRUD.getValorColeccion());
        System.out.println("El volumen total de la colección de las figuras es: " + figuraCRUD.getVolumenColeccion());
        System.out.println("Lista de figuras con capa: " + figuraCRUD.conCapa());
        System.out.println("Figura con precio mayor: " + figuraCRUD.masValioso());

        /*
         * Parte de programación funcional
         * Comenzaremos por guardar los datos de la Colección en un ArraList para consumirlos mediante Lambdas
         */
        ArrayList<Figura> figuras = figuraCRUD.verFiguras();
        figuras.stream()
                .filter(x -> x.getSuperHeroe().getNombre().startsWith("H") && x.getSuperHeroe().getNombre().endsWith("y"))
                .map(x -> x.getSuperHeroe().getNombre().toUpperCase())
                .forEach(System.out::println);
    }
}
