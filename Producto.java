/**
 *  
 * Modela un producto. Todo producto tiene un nombre y un  precio unidad 
 * Gorka Rodriguez
 */
public class Producto
{
    private String nombre;
    private double precioUni;  

    /**
     * Constructor  
     */
    public Producto(String nombre, double precio)    {
        this.nombre = nombre;
        this.precioUni = precio;
    }

    /**
     * accesor para el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * accesor para el precio unidad del producto
     */
    public double getPrecio() {
        return precioUni;
    }

    /**
     * obtiene un nuevo producto copia idéntica del actual
     */
    public Producto obtenerCopia() {
        Producto copia = new Producto(nombre,precioUni);
        return copia;
    }

    /**
     * Representación textual de un producto
     * (ver enunciado)
     */
    public String toString() {
        String lineaFormateada = String.format("%30s |  %8.2f € unidad", nombre, precioUni);
        return lineaFormateada;
    }

}
