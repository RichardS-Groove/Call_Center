package controller;

import interfazUX.CreateAccount;
import interfazUX.Login;
import model.ModeloCreateAccount;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControladorCreateUser implements ActionListener {

    private CreateAccount createAccount;
    private ModeloCreateAccount modeladoCreateAcoount;

    public ControladorCreateUser(CreateAccount createAccount) {
        if (CreateAccount.class == createAccount.getClass()) {
            this.createAccount = createAccount;
            createAccount.getButton_createuser().addActionListener(this);
            createAccount.getButton_cancel().addActionListener(this);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createAccount.getButton_createuser()) {
            System.out.println("Pasa por el create");
            try {
                createUserTxt();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (e.getSource() == createAccount.getButton_cancel()) {
            try {
                cancelCreateUser();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }

    /**
     * Se realiza la logica para el CreateUser
     * @throws IOException
     */
    public void createUserTxt() throws IOException {

        if (createAccount.getTxt_create_Username().getText() == null || createAccount.getTxt_create_Username().getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo User Name es obligatorio", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (createAccount.getTxt_create_name().getText() == null || createAccount.getTxt_create_name().getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo Name es obligatorio", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (createAccount.getTxt_create_lastname().getText() == null || createAccount.getTxt_create_lastname().getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo Last Name es obligatorio", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (createAccount.getTxt_create_password().getText() == null || createAccount.getTxt_create_password().getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo Password es obligatorio", "Alerta", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (createAccount.getTxtRepeatpassword().getText() == null || createAccount.getTxtRepeatpassword().getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "El campo Repeat Password es obligatorio");
            return;
        }

        String password = createAccount.getTxt_create_password().getText();
        String repeatPassword = createAccount.getTxtRepeatpassword().getText();

        if (password.equals(repeatPassword)) {
            System.out.println("Si son iguales");
            JOptionPane.showMessageDialog(null,"Se a creado con exito su usuario", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Se regresara a la ventana del Login, para que inicie sessión", "Alert", JOptionPane.INFORMATION_MESSAGE);
            modeladoCreateAcoount = new ModeloCreateAccount(createAccount.getTxt_create_Username().getText(), createAccount.getTxt_create_name().getText(), createAccount.getTxt_create_lastname().getText(), createAccount.getTxt_create_password().getText());
            modeladoCreateAcoount.crearTxt();
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            Controlador controller = new Controlador(login);
            createAccount.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "El Password no coincide, vuelva a completar");
            return;
        }
        System.out.println("Termina ciclo");
    }

    /**
     * Se realiza la logica para cancelCreateUser
     * @throws IOException
     */
    public void cancelCreateUser() throws IOException {

        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        Controlador controller = new Controlador(login);
        createAccount.dispose();
    }
}
