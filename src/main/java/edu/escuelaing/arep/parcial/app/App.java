package edu.escuelaing.arep.parcial.app;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * ---------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------
 * 													APLICACION PRINCIPAL
 * ---------------------------------------------------------------------------------------------------------------------------
 * Aplicacion encargada de consultar el clima de la ciudad deseada y devolverlo en JSON segun el API gratuito de https://openweathermap.org/
 * Current Weather Data
 * ---------------------------------------------------------------------------------------------------------------------------
 * @author Santiago Buitrago
 * ---------------------------------------------------------------------------------------------------------------------------
 */
public class App {
	public static void main(String[] args) {
		port(getPort());
		get("/hello", (req, res) -> "Hello Heroku");
	}
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; //returns default port if heroku-port isn't set
		
	}
}
