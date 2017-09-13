package se206_a03.views.mainMenu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javax.swing.*;

public class MainMenuController {

    @FXML
    private Button difficultyOneButton;

    @FXML
    private Button difficultyTwoButton;

    @FXML
    private void difficultyOneButtonAction(ActionEvent event){

        //Change scene into difficulty one
        System.out.println("Button 1");
        //stage.show

    }

    @FXML
    private void difficultyTwoButtonAction(ActionEvent event){

        //Change scene into difficulty two

        System.out.println("Button 2");
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
