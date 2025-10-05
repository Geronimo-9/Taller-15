package SRP_Producto;

import Productos.Producto;

public class Etiqueta {
private Producto mercancia;
private String codigoBarra;

public Etiqueta(Producto mercancia, String codigoBarra){
    this.mercancia = mercancia;
    this.codigoBarra = codigoBarra;
}



    public void generarEtiqueta(){
        System.out.println("Nombre del producto: "+mercancia.getNombre());
        System.out.println("Ref: "+mercancia.getReferencia());
        System.out.println("Precio: "+mercancia.getPrecio());
        System.out.println("Cantidad: "+mercancia.getCantidad());
        System.out.println("Cod. Barra: "+codigoBarra);
    }
}
