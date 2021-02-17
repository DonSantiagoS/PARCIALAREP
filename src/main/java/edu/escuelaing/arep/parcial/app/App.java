package edu.escuelaing.arep.parcial.app;

import edu.escuelaing.arep.parcial.app.componentes.*;
import java.io.IOException;
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
	/**
	*	Main del spark quien realiza la consulta con las funciones Lampda
	*	segun las vistas que se soliciten en la aplicacion
	*	@param args
    */
    public static void main(String[] args) {
        port(getPort());
		get("/hello", (req, res) -> "Hello Heroku");
        get("/clima", (req, res) -> resultsPage(req, res));
    }

	/**
	*	Resultado de la aplicacion web bajo la solicitud realizada	
	*
	*	@param req quien indica la informacion de la solicitud
	*	@param res quien indica la informacion de respuesta
	*	@return El clima en la ciudad solicitada en un json 
	*/
    private static String resultsPage(Request req, Response res) throws IOException {
		cache cacheConsulta= new cache();
		String solicitud = req.queryParams("lugar");
		String json = cacheConsulta.getClimaCiudad(solicitud);
		System.out.println(json);
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<style>"
                + "body {text-align: center;"
                + " font-family: \"new century schoolbook\";}"
                + "h2 {text-align: center;}"
                + "p {text-align: center;}"
                + "a {text-align: center;}"
                + "div {text-align: center;}"
                + "form action {text-align: center;}"
                + "</style>"
                + "</head>"
                +"<title>OpenWeather</title>"
                + "<body style=\"background-color:rgb(249,255,201);\">"
                + "<p>" +json+ "</p>"
                + "<br>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
