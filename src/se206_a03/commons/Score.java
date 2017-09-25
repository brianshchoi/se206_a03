package se206_a03.commons;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import se206_a03.views.mainMenu.MainMenu;
import se206_a03.views.testMenu.RecordingMenuController;

import java.io.IOException;

public class Score {
    //Don't delete this////////////////////////
    MainMenu mainMenu = MainMenu.getInstance();
    ///////////////////////////////////////////

    private int _maxRandomNumber;
    private int _questionNumber;
    private int _score;
    private int NUM_QUESTIONS = 10;
    private boolean secondAttempt;

    //Store an array of 10 containing the random numbers



    public Score(int maxRandomNumber){
        _maxRandomNumber = maxRandomNumber;
        _questionNumber = 1;
        _score = 0;
        secondAttempt = false;
    }


    public void start() throws IOException {
        int randomNumber = new RandomNumberGenerator(_maxRandomNumber).generateNumber();


//        if (_questionNumber <= NUM_QUESTIONS){
//
//            try{
//                FXMLLoader loader = new FXMLLoader(getClass().getResource("../testMenu/recordingMenu.fxml"));
//                Parent root = loader.load();
//
//                RecordingMenuController recordingMenuController = loader.getController();
//
//                recordingMenuController.setText(randomNumber);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        mainMenu.setWindow(MainMenu.ScenesEnum.RECORDING_SCENE_ENUM);



    }

    public void incrementScore(){
        // if recording is true, && (_score < NUM_QUESTIONS)
        // _score++;
        //
    }

    public int getScore(){
        return _score;
    }




}
