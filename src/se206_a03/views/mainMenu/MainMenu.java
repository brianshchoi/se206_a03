package se206_a03.views.mainMenu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class MainMenu extends Application {

    private Stage _stage;
    private static final float SCENE_WIDTH = 600;
    private static final float SCENE_HEIGHT = 600;

    @FXML
    private Button difficultyOneButton;

    @FXML
    private Button difficultyTwoButton;



    @Override
    public void start(Stage stage) throws IOException{
        _stage = stage;

        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));

        _stage.setTitle("Tātai - Learn Māori Numbers");
        _stage.setScene(new Scene(root, SCENE_WIDTH, SCENE_HEIGHT));
        _stage.setResizable(false);
        _stage.show();
    }



    public void switchScene(String fxmlURL){
        FXMLLoader loader = new FXMLLoader((getClass().getResource(fxmlURL)));
        Parent root;

        try{
            root = (Parent)loader.load();
            _stage.setScene(new Scene(root, SCENE_WIDTH, SCENE_HEIGHT));


        }catch (IOException e){
            e.printStackTrace();
        }

    }



    @FXML
    private void handleButtonAction(ActionEvent event){
        if (event.getTarget() == difficultyOneButton){
            switchScene("../testMenu/recordingMenu.fxml");      //Somehow set the scene to recording scene

            //set random number generator to 1-9

            System.out.println("Button 1 Pressed");
        }

        else if (event.getTarget() == difficultyTwoButton){
            //Somehow set the scene to recording scene

            //set random number generator to 1-99
            System.out.println("Button 2 Pressed");
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




    public static void main(String[] args) {
        launch(args);
    }
}
