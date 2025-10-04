import Producto.Libro;
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


    }
}