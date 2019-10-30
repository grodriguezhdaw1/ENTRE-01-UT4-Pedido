
/**
 *  Representa a un cliente que hace un pedido 
 *  Gorka Rodriguez
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;

    /**
     * Constructor  
     */
    public Cliente(String nombre, String direccion, String ciudad, String provincia)    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    /**
     * accesor para el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * accesor para la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Accesor para la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Accesor para la provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Representación textual del cliente
     */
    public String toString() {
        String lineaFormateada = String.format(
                "%10s: %-10s \n%10s: %-10s \n%10s: %-10s \n%10s: %-10s","NOMBRE",this.getNombre(),"DIRECCION",this.getDireccion(),"CIUDAD", this.getCiudad(),"PROVINCIA", this.getProvincia());
        return lineaFormateada;
    }

    /**
     * 
     */
    public void print() {
        System.out.println();
        System.out.println(this.toString());
    }

}
