package se206_a03.views.MainMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

//    private Parent root;


    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        stage.setTitle("Tātai - Learn Māori Numbers");
        stage.setScene(new Scene(root, 600, 600));
        stage.setResizable(false);

        stage.show();
    }


//    private Parent getScene(){
//
//
//
//
//    }


    private enum Scenes{
        MainMenu,

    }

    public static void main(String[] args) {
        launch(args);
    }
}
