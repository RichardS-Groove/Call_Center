package controller;

import interfazUX.CreateAccount;
import interfazUX.Login;
import model.ModeladoLogin;
import model.ModeloCreateAccount;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Controlador implements ActionListener {

    private static Scanner sc;
    private static int intentos;
    private static String user, pwd;

    private Login login;
    private ModeladoLogin modeladoLogin;
    DefaultTableModel modeloTable = new DefaultTableModel();

    public Controlador() {
    }

    /**
     * En el controlador se declara el inicio del button,
     * Asi mismo se inicia las Clases.
     *
     * @param login
     */
    public Controlador(Login login) {
        this.login = login;
        modeladoLogin = new ModeladoLogin();
        login.getButton_login().addActionListener(this);
        login.getButton_create_account().addActionListener(this);

    }


    /**
     * Se sobreescribe el metodo de la acción.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.getButton_login()) {
            sessionLogin();
        } else if (e.getSource() == login.getButton_create_account()) {
            try {

                CreateAccount createAccount = new CreateAccount();
                createAccount.setVisible(true);
                createAccount.setLocationRelativeTo(null);
                ControladorCreateUser controladorCreateUser = new ControladorCreateUser(createAccount);
                login.dispose();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }

    }


    public void sessionLogin() {
        int nLineas = 0;
        int i = 0;
        String[] usuarios = null;
        String linea;
        FileReader fr = null;

        try {
            sc = new Scanner(new File("user.txt")); // Recordar establecer la ruta de leer el archivo, este txt se crea desde el controlador Create User.
            File f = new File("user.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                nLineas++;
            }

            usuarios = new String[nLineas]; // El tamaño del arreglo

            while (sc.hasNextLine()) {
                usuarios[i++] = sc.nextLine();
            }

            intentos++;
            user = login.getTxtUsername().getText();
            pwd = login.getTxtPassword().getText();

            ModeladoLogin s = new ModeladoLogin(); // ->  Creamos un objeto donde pasamos a completar el constructor.
            s.validarUsuario(usuarios, user, pwd, intentos);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        if (intentos == 0) login.dispose();

    }


    public static int getIntentos() {
        return intentos;
    }

    public static void setIntentos(int intentos) {
        Controlador.intentos = intentos;
    }

}
