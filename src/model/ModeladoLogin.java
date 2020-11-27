package model;

import controller.Controlador;
import interfazUX.TableProduct;
import javax.swing.*;
import java.io.IOException;

public class ModeladoLogin {
    Controlador controller = new Controlador();
    String res;

    public ModeladoLogin() {
    }

    /**
     * Se crea un constructor donde se analiza toda la información ingresada desde la ventana.
     * @param usuarios
     * @param user
     * @param pwd
     * @param intentos
     * @throws IOException
     */
    public void validarUsuario(String usuarios[], String user, String pwd, int intentos) throws IOException {

        boolean encontrado = false;

        for (int i = 0; i < usuarios.length; i++) {
            if ((usuarios[i].equalsIgnoreCase(user)) && usuarios[i + 3].equals(pwd)) {
                res = "Bienvenido " + user;
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "Inicio de Sesion", JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
                controller.setIntentos(intentos);
                TableProduct tableProduct = new TableProduct();
                tableProduct.setVisible(true);
                tableProduct.setLocationRelativeTo(null);
                break;
            }
        }

        if (encontrado == false) {
            res = "Clave y/o usuario erroneos van " + intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res, "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
        }

        if (intentos > 2) {
            JOptionPane.showMessageDialog(null, "3 intentos fallidos, esto se cerrara", "Inicio de Sesion", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
