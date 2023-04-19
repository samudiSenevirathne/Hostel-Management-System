package lk.ijse.hostel.hibernate.layered.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public AnchorPane loginAnchorId;
    public JFXButton btnMiniId;
    public JFXTextField txtUser;
    public JFXPasswordField txtPassword;
    public ImageView eyeId;
    private Stage stage;

    public void initialize(){


    }

    public void inti(Stage stage){
        this.stage=stage;
        txtUser.requestFocus();
    }


    public void btnCloseOnAction(ActionEvent actionEvent) {
        stage.close();
    }

    public void btnMinimizeOnAction(ActionEvent actionEvent) {
        stage.setIconified(true);
    }

    public void btnBackOnAvtion(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) loginAnchorId.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/hostel/hibernate/layered/view/WelcomeForm.fxml"));
        Scene scene = new Scene(loader.load());
        stage.centerOnScreen();
        stage.setScene(scene);
        ((WelcomeFormController) loader.getController()).inti(stage);
    }

    public void btnLoginOnAvtion(ActionEvent actionEvent) throws IOException {
//        Stage stage =(Stage) loginAnchorId.getScene().getWindow();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/hostel/hibernate/layered/view/DashBordForm.fxml"));
//        Scene scene = new Scene(loader.load());
//        stage.centerOnScreen();
//        stage.setScene(scene);
//        ((DashBordFormController) loader.getController()).inti(stage);
    }

    public void btnCancelOnAvtion(ActionEvent actionEvent) {
        System.exit(0);
    }
}
