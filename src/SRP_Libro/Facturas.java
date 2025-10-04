package SRP_Libro;

import Producto.Libro;


//Generará una factura del libro comprado de la libreria
public class Facturas {

    private Libro libro;

public Facturas(Libro libro){
    this.libro = libro;
}
    public void crearFactura(){
        System.out.println("Nombre del Libro: "+libro.getNombre());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("Paginas :"+libro.getPaginas());
        System.out.println("Total a pagar: "+libro.calcularTotal());
    }

}
