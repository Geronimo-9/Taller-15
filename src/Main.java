import Productos.Libro;
import Productos.Producto;
import SRP_Libro.AlmacenarLibro;
import SRP_Libro.Facturas;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1, Aplicando Responsabilidad Unica, organizando el diseño del software con buenas prácticas
        Libro l1 = new Libro("Mi luna de miel","Geronimo",900,35000);


        AlmacenarLibro Panamericana = new AlmacenarLibro(l1);
        Facturas cheque = new Facturas(l1);


        Panamericana.almacenar();
        cheque.crearFactura();




        //Ejercicio 2, Clase producto usando los metodos de la clase, fase 1.

        Producto shampoo1 = new Producto("Pantene","P011",9, 15000);
        Producto acondicionador1 = new Producto("Pantene","P021", 2, 15000);



        //testeando la logica interna del negocio para asegurar su buen funcionamiento.
        System.out.println(shampoo1.calcularTotal());
        System.out.println(acondicionador1.calcularTotal());




        shampoo1.generarFactura();
        shampoo1.almacenarProducto();

        acondicionador1.generarFactura();
        acondicionador1.almacenarProducto();





    }
}