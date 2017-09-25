package se206_a03.views.mainMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class MainMenu extends Application {
    //Singleton Class MainMenu
    private static MainMenu instance = null;

    private static final float SCENE_WIDTH = 600;
    private static final float SCENE_HEIGHT = 550;

    private static final String MAIN_FXML = "mainMenu.fxml";
    private static final String RECORDING_FXML = "../testMenu/recordingMenu.fxml";
    private static final String CORRECT_FXML = "../testMenu/correct.fxml";
    private static final String INCORRECT_FXML = "../testMenu/incorrect.fxml";

    private static Stage window;

    private static Scene mainMenuScene;
    private static Scene recordingScene;
    private static Scene correctScene;
    private static Scene incorrectScene;

    public static MainMenu getInstance() {
        if (instance == null){
            instance = new MainMenu();

            try {
                mainMenuScene = instance.createScenes(MAIN_FXML);
                recordingScene = instance.createScenes(RECORDING_FXML);
                correctScene = instance.createScenes(CORRECT_FXML);
                incorrectScene = instance.createScenes(INCORRECT_FXML);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return instance;
    }

    @Override
    public void start(Stage stage) throws IOException {
        createScenes(MAIN_FXML);

        window = stage;
        window.setTitle("Tātai - Learn Māori Numbers");
        window.setScene(mainMenuScene);
        window.show();

        //Window Quit Prompt
        window.setOnCloseRequest(we -> {
            int confirm = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",
                    "Tātai - Learn Māori Numbers", 0, 3, null, null, null);
            if (confirm == 0) {
                System.exit(0);
            }
        });

    }

    //Create different scenes using the FXML directory
    private Scene createScenes(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        Parent mainRoot = fxmlLoader.load();
        Scene scene = new Scene(mainRoot, SCENE_WIDTH, SCENE_HEIGHT);
        scene.getStylesheets().add(getClass().getResource("../../resources/Main.css").toExternalForm());
        return scene;
    }

    public enum ScenesEnum {
        MAIN_SCENE_ENUM,
        RECORDING_SCENE_ENUM,
        CORRECT_SCENE_ENUM,
        INCORRECT_SCENE_ENUM;
    }

    public void setWindow(ScenesEnum scenes) throws IOException {
        switch(scenes){
            case MAIN_SCENE_ENUM:
                window.setScene(mainMenuScene);
                break;
            case RECORDING_SCENE_ENUM:
                window.setScene(recordingScene);
                break;
            case CORRECT_SCENE_ENUM:
                window.setScene(correctScene);
                break;
            case INCORRECT_SCENE_ENUM:
                window.setScene(incorrectScene);
                break;
            default:
                break;
        }
    }

    public Scene getScene(ScenesEnum scenes) throws IOException {
        switch(scenes){
            case MAIN_SCENE_ENUM:
                return mainMenuScene;
            case RECORDING_SCENE_ENUM:
                return recordingScene;
            case CORRECT_SCENE_ENUM:
                return correctScene;
            case INCORRECT_SCENE_ENUM:
                return incorrectScene;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
