package SRP_Producto;

import Productos.Producto;

public class AlmacenarProducto {
    private Producto mercancia;

    public AlmacenarProducto(Producto mercancia){
        this.mercancia = mercancia;
    }

    public void GuardarMercancia(){
        System.out.println("Su producto fue guardado con exito");
    }



}
