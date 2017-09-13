package se206_a03.views.mainMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage _stage;
    private static Scene _mainMenu;
//    private static Scene _recordingMenu;
//    private static Scene _maoriNumberMenu;

    @Override
    public void start(Stage stage) throws IOException{
        _stage = stage;




        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        _stage.setTitle("Tātai - Learn Māori Numbers");
        _stage.setScene(new Scene(root, 600,600));
        _stage.setResizable(false);
        _stage.show();
    }





    private void initialiseScenes() throws IOException {
        _mainMenu = new Scene(FXMLLoader.load(getClass().getResource("mainMenu.fxml")), 600, 600);

//        _recordingMenu = new Scene(FXMLLoader.load(getClass().getResource("/se206_a03/views/testMenu/recordingMenu.fxml")), 600, 600);
//        _maoriNumberMenu = new Scene(FXMLLoader.load(getClass().getResource("/se206_a03/views/testMenu/maoriNumberMenu.fxml")), 600, 600);
    }

    private enum Scenes{
        MainMenu,
        MaoriNumberMenu,
        RecordingMenu

    }

    public static void main(String[] args) {
        launch(args);
    }
}
