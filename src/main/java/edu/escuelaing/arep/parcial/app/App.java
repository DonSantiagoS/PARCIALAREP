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

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action=\"/results\">"
                + "  First name:<br>"
                + "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">"
                + "  <br>"
                + "  Last name:<br>"
                + "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        return req.queryParams("firstname") + " " +
                req.queryParams("lastname");
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