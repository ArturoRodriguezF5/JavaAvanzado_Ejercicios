package ejercicio.funcional.java;

public class Main {

    // Creamos un objeto tipo CRUD
    public static FiguraCRUD figuraCRUD = new Coleccion();
    public static void main(String[] args) {
        // Creamos objetos de tipo dimension
        SuperHeroe sh1 = new SuperHeroe("Batman");
        SuperHeroe sh2 = new SuperHeroe("SuperMan");
        // Creamos objetos de tipo SuperHeroe
        Dimension dim1 = new Dimension(2, 3, 4);
        Dimension dim2 = new Dimension(3, 5, 5);

        // Creamos objetos de tipo Figura para meterlos a las colecciones
        Figura fig1 = new Figura("Fig01", 504.2,sh1, dim1);
        Figura fig2 = new Figura("Fig02", 200.4, sh2, dim2);

        figuraCRUD.addFigura(fig1);
        figuraCRUD.addFigura(fig2);
        System.out.println("La coleccion contiene estas figuras: " + figuraCRUD.verFiguras());


    }
}
