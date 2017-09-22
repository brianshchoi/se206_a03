package se206_a03.commons;

public class RandomNumberGenerator {

    private int _maxNumber;
    private int _randomNumber;

    public RandomNumberGenerator(int maxNumber){
        _maxNumber = maxNumber;
    }

    public int generateNumber(){
        _randomNumber = (int)(Math.random() * _maxNumber) + 1;

        return _randomNumber;
    }


}
