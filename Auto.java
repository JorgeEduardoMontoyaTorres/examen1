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

public class Auto
{
    private String p;
    private int h;
    private int m;
    private int h2;
    private int m2;
    
    public Auto()
    {
        p = "";
        h = 0;
        m = 0;
        h2 = 0;
        m2 = 0;
    }
    
    public void PideDatosEntrada(String placas, int horas, int minutos)
    {
        p = placas;
        
        if(horas <= 23)
            h = horas;
        
        if(minutos <= 59)
            m = minutos;
    }
    
    public void PideDatosDSalida(int horas, int minutos)
    {
        if(horas <= 23)
            h2 = horas;
        
        if(minutos <= 59)
            m2 = minutos;
    }
    
    public String dimePlacas()
    {
        return p;
    }
    
    public int dimeHoraEntrada()
    {
        return h;
    }
    
    public int dimeMinutoEntrada()
    {
        return m;
    }
    
    public int dimeHoraSalida()
    {
        return h2;
    }
    
    public int dimeMinutoSalida()
    {
        return m2;
    }
}