import java.util.Scanner;
/**
 *  Clase para probar el resto de clases
 *  Gorka Rodriguez
 */
public class TestPedido
{
    private Pedido pedido1; 
    private Pedido pedido2; 
    private Scanner teclado;
    /**
     * Constructor  
     */
    public TestPedido()    {
        teclado = new Scanner(System.in);
        // crear pedido1
        pedido1 = new Pedido(new Fecha(4, 9, 2019),
            new Cliente("Juan Soto","Avda. PioXII", "Pamplona", "Navarra"),
            new LineaPedido(new Producto("Rotulador fosforescente", 6.70),20),
            new LineaPedido(new Producto("Memoria USB 64GB", 14.80),10));
        // crear pedido2
        pedido2 = new Pedido(new Fecha(8, 10, 2019),
            new Cliente("Elisa Nuin","C/ Rio Alzania 7", "Pamplona", "Navarra"),
            new LineaPedido(new Producto("Sacapuntas manual", 16.64),8),
            new LineaPedido(new Producto("Corrector tippex", 5.99), 20)); 

    }

    /**
     * Muestra la información de los dos pedidos (ver enunciado)
     */
    public void mostrarPedidos() {
        System.out.println(); //Para que se vea mejor a la hora de mostrarlo
        System.out.println("Pedido 1\n------------------------\n" + pedido1.toString());
        pausa();
        System.out.println("Pedido 2\n------------------------\n" + pedido2.toString());
        System.out.println();
        if(pedido1.masAntiguoQue(pedido2)){
            System.out.println("El pedido 1 se ha realizado antes que el pedido 2");
        } else {
            System.out.println("El pedido 2 se ha realizado antes que el pedido 1");
        }

    }

    private void pausa() {
        System.out.println("\n\nPulse <Intro> para continuar");
        teclado.nextLine();
        System.out.println("\u000C");
    }
}
