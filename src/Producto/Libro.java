package Producto;

public class Libro {
   private String nombre;
   private String autor;
   private int paginas;
   private double precio;
   private double iva = 0.19;


   public Libro(String nombre, String autor, int paginas, double precio){
      this.nombre = nombre;
      this.autor = autor;
      setPaginas(paginas);
      setPrecio(precio);

   }


   public String getAutor() {
      return autor;
   }

   public String getNombre() {
      return nombre;
   }




   public int getPaginas() {
      return paginas;
   }

   public void setPaginas(int paginas) {
      if(paginas >= 0){
         this.paginas = paginas;
      }
   }


   public double getPrecio() {
      return precio;
   }

   public void setPrecio(double precio) {
      if(precio>=0){
         this.precio = precio;
      }
   }



public double calcularTotal(){
      return precio+(precio*iva);
}





}


