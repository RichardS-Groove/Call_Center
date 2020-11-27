package model;

import java.io.FileWriter;
import java.io.IOException;

public class ModeloCreateAccount {
    private String createUser;
    private String name;
    private String lastName;
    private String password;
    private String repeatPassword;

    public ModeloCreateAccount() {
    }

    public ModeloCreateAccount(String createUser, String name, String lastName, String password) {
        this.createUser = createUser;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }

    public void crearTxt() throws IOException {
        FileWriter fichero = new FileWriter("user.txt");
        fichero.write(this.createUser + "\n" + this.name + "\n" + this.lastName + "\n" + this.password);
        fichero.close();
    }
}
