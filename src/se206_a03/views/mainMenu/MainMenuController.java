package se206_a03.views.mainMenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import se206_a03.commons.Score;

import java.io.IOException;

public class MainMenuController{

    MainMenu mainMenu = MainMenu.getInstance();

    @FXML
    private Button difficultyOneButton;

    @FXML
    private Button difficultyTwoButton;

    @FXML
    public void initialize(){
        System.out.println("TEST MAINMENU");
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        int easyLimit = 9;
        int hardLimit = 99;

        if (event.getTarget() == difficultyOneButton){
            Score easyScore = new Score(easyLimit);
            easyScore.start();
        }

        else if (event.getTarget() == difficultyTwoButton) {
            Score hardScore = new Score(hardLimit);
            hardScore.start();
        }


        //Start score counting out of 10


    }




}
