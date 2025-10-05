package SRP_Producto;

import Productos.Producto;

public class FacturaProducto {
    private Producto mercancia;

    public FacturaProducto(Producto mercancia){
        this.mercancia = mercancia;
    }



    public void generarFactura(){
        System.out.println("Nombre del producto: "+mercancia.getNombre());
        System.out.println("Ref: "+mercancia.getReferencia());
        System.out.println("Precio: "+mercancia.getPrecio());
        System.out.println("Cantidad: "+mercancia.getCantidad());
        System.out.println("Total: "+mercancia.calcularTotal());
    }
}
