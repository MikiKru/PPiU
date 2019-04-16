package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import service.LoginService;
import util.DBConnector;

import java.io.IOException;
import java.sql.*;

public class LoginController {

    @FXML
    private TextField tf_login;

    @FXML
    private PasswordField pf_password;

    // Obiekty globalne
    private DBConnector dbConnector;
    public static Connection connection;
    public LoginService loginService;
    @FXML
    void loginAction(ActionEvent event) throws SQLException, IOException {
        loginService.logIn(tf_login.getText(),pf_password.getText(), tf_login);

    }
    @FXML
    void keyLoginAction(KeyEvent event) throws SQLException, IOException {
        if(event.getCode() == KeyCode.ENTER){
            loginService.logIn(tf_login.getText(),pf_password.getText(), tf_login);
        }
    }
    @FXML
    void registerAction(ActionEvent event) {

    }
    // inicjalizacja wartości początkowych aplikacji
    public void initialize() throws SQLException {
        dbConnector = new DBConnector();
        connection = dbConnector.initializeConnection();
        loginService = new LoginService();

    }


}