package edu.escuelaing.arep.parcial.componentes;


import java.io.IOException;
/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													HTTP CONNECTION
 * ---------------------------------------------------------------------------------------------------------------------------
 * Clase: HttpConnection
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */

public interface HttpConnection {

    public String getWeatherByCity(String city)  throws  IOException;

}