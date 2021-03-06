package edu.escuelaing.arep.parcial.app.componentes;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													CACHE
 * ---------------------------------------------------------------------------------------------------------------------------
 * Clase: cache
 * Encargada de consultar si en el cache se cuenta con el clima del lugar solicitado o se debe consultar de nuevo
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */
 
 public class cache {
	
    private ConcurrentHashMap<String, String> lugares;
	private coneccion web;
	public cache(){
		lugares=new ConcurrentHashMap<>();
		web = new coneccion();
	}
    /**
     * Agrega en el hashmap los climas de los lugares que ya fueron consultados en determinado momento
     *
     * @param lugar correspondiente al clima consultado
     * @param clima correspondiente al lugar
     */
    public void agregar(String lugar ,String clima){
        lugares.put(lugar,clima);
    }

    /**
     * Metodo encargado de verificar si el clima de determinado lugar 
	 * ya se encuentra en cache o se debe verificar
	 *
     * @param lugar el cual se desea consultar
     * @return el clima del lugar solicitado
     * @throws IOException
     */
    public  String getClimaCiudad(String lugar) throws IOException {
        if(lugares.containsKey(lugar)) {
            return lugares.get(lugar);
        }else{
            String clima = web.getClimaCiudadAPI(lugar);
            lugares.put(lugar,clima);
            return clima;
        }
    }
}