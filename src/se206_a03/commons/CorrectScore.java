package se206_a03.commons;

public class CorrectScore {

    private static final int NUMBEROFTESTS = 10;
    private int[] testArray;

    private int _score;

    public CorrectScore(){
        //Initial score always zero
        _score = 0;

    }

    public int numberOfTestsCorrect(){
        int count = 0;

        for(int i = 0; i < NUMBEROFTESTS; i++){
            if( isCorrect(testArray[i])) {
                count++;
            }
        }

        return _score;
    }

    private boolean isCorrect(int index) {



        return false;
    }


}
