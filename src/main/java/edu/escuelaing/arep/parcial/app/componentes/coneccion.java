package edu.escuelaing.arep.parcial.componentes;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.URL;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CONECCION
 * ---------------------------------------------------------------------------------------------------------------------------
 * Clase: coneccion
 * Encargada de realizar la respectiva coneccion solicitud la API gratuita https://openweathermap.org/
 * Current Weather Data
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */
 
 public class coneccion implements HttpConnection{
	 
	
	/**
	*	
	*	@param lugar quien indica cual es lugar del cual se desea saber el clima
	*	@throws IOException
	*/
	public String getClimaCiudad(String lugar)  throws  IOException {
        
		String USER_AGENT = "Mozilla/5.0";
        String GET_URL = "http://api.openweathermap.org/data/2.5/weather?q="+lugar+"&appid=6e72a28cc3ae5b0869e48a94997f0fd3";
        URL url = new URL(GET_URL);
        HttpURLConnection solicitud = (HttpURLConnection) url.openConnection();
        solicitud.setRequestMethod("GET");
        solicitud.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = solicitud.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    solicitud.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
            return response.toString();
        } else {
            return null;
        }
    }
 }
 