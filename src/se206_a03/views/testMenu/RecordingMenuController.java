package se206_a03.views.testMenu;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import se206_a03.views.mainMenu.MainMenu;


public class RecordingMenuController {
    MainMenu mainMenu = MainMenu.getInstance();

    @FXML
    private Label recordingNumberLabel;

    @FXML
    private Label questionNumberLabel;

    @FXML
    private Button microphoneButton;

    @FXML
    public void initialize(){
        System.out.println("Test Initialize");
    }


    @FXML
    private void microphoneAction(ActionEvent event){
        //Record
        //Insert HTK Toolkit here
        //



        //This section makes the microphone button unpressable for 3 seconds
        Service<Void> service = new Service<Void>() {
            @Override
            protected Task<Void> createTask() {
                return new Task<Void>() {
                    @Override
                    protected Void call() throws Exception {
                        Thread.sleep(3000);                           //sleep for 3 seconds
                        return null;
                    }
                };
            }
        };
        microphoneButton.disableProperty().bind(service.runningProperty());
        service.start();


    }


    //This method works correctly

    // Just need to make it so that the method can be called from MainMenuController
    public void setText(int randomNumber){
        String numToString = Integer.toString(randomNumber);
        String questionNumber = "2";

        questionNumberLabel.setText("Question "+ questionNumber );
        recordingNumberLabel.setText("Please Record\n\n" + numToString);

    }



}
