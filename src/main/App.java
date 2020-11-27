package main;

import controller.Controlador;
import interfazUX.Login;
import java.io.IOException;

public class App {

    /**
     * Ejecutar esté main, ya que es la raiz principal de todo el Software !
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        Controlador controller = new Controlador(login);
    }
}
