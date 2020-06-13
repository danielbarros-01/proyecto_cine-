package VISTA;

import CONTROLADOR.Cliente_bd;
import MODELO.Cliente;
import MODELO.Conexion;
import java.sql.Connection;

/**
 *
 * @author grupo 4
 */
public class main {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Conexion cargar = new Conexion();
            Connection con = cargar.getConex();
            System.out.println("Conectado");

            Cliente juan = new Cliente("juan", "perez", 22222);

            Cliente_bd ad = new Cliente_bd(cargar);

            ad.guardarCliente(juan);

        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
