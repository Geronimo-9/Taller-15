package SRP_Libro;

import Producto.Libro;

//Almacenara el libro a la base de dato de la libreria
public class AlmacenarLibro {
    private Libro libro;
    private String nombre;


    public AlmacenarLibro(Libro libro){
        this.libro = libro;
        this.nombre = nombre;
    }








    public void almacenar(){
        System.out.println("El libro "+libro.getNombre()+" se guardó con exito");
    }


}
