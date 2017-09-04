/**
 * En el Centro histórico de la ciudad de San Luis Potosí, capital del estado del mismo nombre,
 * existe un estacionamiento público en la calle de Independencia esquina con Madero.
 * El estacionamiento tiene una capacidad para 150 vehículos, y tiene un costo de $15 pesos
 * por hora o fracción. Al momento de ingresar un vehículo, el encargado del estacionamiento
 * registra las placas del vehículo, junto con la hora y los minutos de llegada.
 * Si el estacionamiento está lleno, entonces el vehículo no puede ingresar y se
 * tiene que ir a buscar otro estacionamiento. Al momento de salir, el encargado
 * del estacionamiento nuevamente ingresa las placas del vehículo, junto con la hora
 * y los minutos de salida. El sistema de control del estacionamiento deberá calcular
 * el costo total que se cobrará al vehículo dependiendo del número de horas o fracción
 * que estuvo estacionado. Si durante la salida el encargado del estacionamiento ingresa un
 * número de placas incorrecto, entonces el sistema deberá informar que tal vehículo no se
 * encuentra registrado y no podrá calcular el costo del estacionamiento.

 *  Escribir las clases y métodos requeridos para crear una aplicación para el estacionamiento,
 *  la cual permita registrar la entrada de vehículos y calcular el costo del estacionamiento
 *  a su salida, de acuerdo con la descripción del problema.
 */
import java.util.ArrayList;

public class Estacionamiento
{ 
    ArrayList<Auto> autos;
    private int costo;
    private int totalcoches;
    
    public Estacionamiento()
    {
        costo = 15;
        totalcoches = 150;
    }
    
    //public Auto registraAuto(ArrayList<Auto> autos)
    //{
         //autos.add(); 
    //}
    
    private int calculaCosto()
    {
        //costo = dimeHoraSalida() - dimeHoraEntrada();
        
        
        return costo;
    }
}