package lk.ijse.hostel.hibernate.layered.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBordFormController {

    public AnchorPane DadhAdmiAnchId;
    public JFXButton btnMiniId;
    public AnchorPane context;
    public Label lblTotalOfStudent;
    public Label lblTotalOfRoom;
    public Label lblTotalOfPaidKeyMoneyStudent;
    public Label lblNonAc;
    public Label lblAc;
    public Label lblNonAcWithFood;
    public Label lblAcWithFood;
    public Label lblDate;
    public Label lblTime;
    private Stage stage;

    public void initialize(){


    }

    public void inti(Stage stage) {
        this.stage = stage;
    }

    public void btnRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("/lk/ijse/hostel/hibernate/layered/view/RoomForm");
    }

    public void btnUserOnAction(ActionEvent actionEvent) throws IOException {
        setUi("/lk/ijse/hostel/hibernate/layered/view/UserForm");
    }

    public void btnStudentOnAction(ActionEvent actionEvent) throws IOException {
        setUi("/lk/ijse/hostel/hibernate/layered/view/StudentForm");
    }

    public void btnMinimizeOnAction(ActionEvent actionEvent) {
        stage.setIconified(true);
    }

    public void btnCloseOnAction(ActionEvent actionEvent) {
        stage.close();
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("/lk/ijse/hostel/hibernate/layered/view/DashBordContextForm");
    }

    private void setUi(String ui) throws IOException {
        Parent node = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        context.getChildren().clear();
        context.getChildren().add(node);
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage =(Stage) DadhAdmiAnchId.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/ijse/hostel/hibernate/layered/view/LoginForm.fxml"));
        Scene scene = new Scene(loader.load());
        stage.centerOnScreen();
        stage.setScene(scene);
        ((LoginFormController) loader.getController()).inti(stage);
    }

    public void btnReservationOnAction(ActionEvent actionEvent) throws IOException {
        setUi("/lk/ijse/hostel/hibernate/layered/view/ReservationForm");
    }
}
