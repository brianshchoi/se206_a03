package se206_a03.views.testMenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import se206_a03.views.mainMenu.MainMenu;

import java.io.IOException;
import java.util.logging.Logger;


public class RecordingMenuController {

    MainMenu mainMenu = MainMenu.getInstance();

    @FXML
    private Label recordingNumberLabel;


    @FXML
    private Button microphoneButton;

    @FXML
    private void microphoneAction(ActionEvent event){
        //Record

        // Make button unclickable for 3 seconds.
        try {
            mainMenu.setWindow(MainMenu.ScenesEnum.MAIN_SCENE_ENUM);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Microphone pressed");
        //Change scene into difficulty one

    }

    public void setText(int randomNumber){
        String numToString = Integer.toString(randomNumber);

        recordingNumberLabel.setText("Please Record\n\n" + numToString);


    }



}
