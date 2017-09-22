package se206_a03.views.mainMenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import se206_a03.commons.RandomNumberGenerator;
import se206_a03.views.testMenu.RecordingMenuController;

import javax.swing.*;
import java.io.IOException;

public class MainMenuController{

    @FXML
    private Button difficultyOneButton;


    @FXML
    private Button difficultyTwoButton;

    MainMenu mainMenu = MainMenu.getInstance();

    private static final float SCENE_WIDTH = 600;
    private static final float SCENE_HEIGHT = 600;

    private static final String MAINMENU = "mainMenu.fxml";
    private static final String RECORDINGMENU = "../testMenu/recordingMenu.fxml";


    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        int easyLimit = 9;
        int hardLimit = 99;

        if (event.getTarget() == difficultyOneButton){
            //Easy difficulty Random Number Generator
            setTextRecordingNumber(new RandomNumberGenerator(easyLimit).generateNumber());
        }

        else if (event.getTarget() == difficultyTwoButton) {
            //Hard difficulty Random Number Generator
            setTextRecordingNumber(new RandomNumberGenerator(hardLimit).generateNumber());
        }


        //Start score counting out of 10


        mainMenu.setWindow(MainMenu.ScenesEnum.RECORDING_SCENE_ENUM);
    }

    private void setTextRecordingNumber(int randomNumber){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../testMenu/recordingMenu.fxml"));
            loader.load();

            RecordingMenuController controller = loader.getController();
            controller.setText(randomNumber);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    private void quit(ActionEvent event) {

        int confirm = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                "Tātai - Learn Māori Numbers", 0, 3, null, null, null);

        if (confirm == 0) {
            System.exit(0);
        }

    }


}
