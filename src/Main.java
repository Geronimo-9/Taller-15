import Productos.Libro;
import Productos.Producto;
import SRP_Libro.AlmacenarLibro;
import SRP_Libro.Facturas;
import SRP_Producto.AlmacenarProducto;
import SRP_Producto.Etiqueta;
import SRP_Producto.FacturaProducto;

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


        //Tres responsabilidades: Etiquetas, GenerarFacturas y Almacenamiento en Bodega (Inventario).


        // Nueva implementacion al ejercicio, con codigo de barra simulado al ejemplo de Pantene.
        Etiqueta etiqueta1 = new Etiqueta(shampoo1, "75004351600113");
        Etiqueta etiqueta2 = new Etiqueta(acondicionador1,"75004351600219");

        FacturaProducto factura1 = new FacturaProducto(shampoo1);
        FacturaProducto factura2 = new FacturaProducto(acondicionador1);

        AlmacenarProducto bodega1 = new AlmacenarProducto(shampoo1);
        AlmacenarProducto bodega2 = new AlmacenarProducto(acondicionador1);




        etiqueta1.generarEtiqueta();
        factura1.generarFactura();
        bodega1.GuardarMercancia();

        etiqueta2.generarEtiqueta();
        factura2.generarFactura();
        bodega2.GuardarMercancia();













    }
}