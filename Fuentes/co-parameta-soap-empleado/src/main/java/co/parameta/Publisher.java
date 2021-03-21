package co.parameta;
import co.parameta.interfaces.EmpleadoInterface;
import co.parameta.servicios.EmpleadoServiceImpl;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        final String _HOST = "localhost";
        final int _PORT = 9040;
        final String _PATH_SERCIVE = "ServiciosSoap";

        String address = String.format("http://%s:%d/%s", _HOST, _PORT, _PATH_SERCIVE);
        Endpoint.publish(address, new EmpleadoServiceImpl());

        System.out.println("Service is running = " + address + "?wsdl");
    }
}
