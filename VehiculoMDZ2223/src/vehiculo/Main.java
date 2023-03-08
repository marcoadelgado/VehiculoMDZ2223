
package vehiculo;

import java.awt.TexturePaintContext;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMDZ2223 miVehiculoMDZ2223;
        int stockActual;
        
        miVehiculoMDZ2223 = new VehiculoMDZ2223("Seat",18000,100);
        operativaVehiculosMDZ2223(miVehiculoMDZ2223, 50); 
    }

    public static void operativaVehiculosMDZ2223(VehiculoMDZ2223 miVehiculoMDZ2223, Int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMDZ2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMDZ2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMDZ2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
