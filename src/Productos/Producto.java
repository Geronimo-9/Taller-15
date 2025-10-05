package Productos;

public class Producto {

    private String nombre;
    private String referencia;
    private double precio;
    private int cantidad;
    private final double iva = 0.19; //Es un impuesto fijo.




    public Producto(String nombre, String referencia, int cantidad , double precio){
        this.nombre = nombre;
        this.referencia = referencia;
        setCantidad(cantidad);
        setPrecio(precio);
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getReferencia() {
        return referencia;
    }


    public void setPrecio(double precio) {
        if (precio>=0){
            this.precio = precio;
        }
    }

    public void setCantidad(int cantidad) {
        if(cantidad>=0){
            this.cantidad = cantidad;
        }
    }

    public double calcularTotal(){
        return (iva*precio) + precio*cantidad;
    }












}

