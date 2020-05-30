package com.upGrad;

class Bird{
    private boolean canBirdFly ;
    private String birdVoice;

    public boolean isCanBirdFly() {
        return canBirdFly;
    }

    public void setCanBirdFly(boolean canBirdFly) {
        this.canBirdFly = canBirdFly;
    }

    public String getBirdVoice() {
        return birdVoice;
    }

    public void setBirdVoice(String birdVoice) {
        this.birdVoice = birdVoice;
    }
}
}
class ToyBird extends Bird{
    public ToyBird(){
        this.canBirdFly = false;
        this.birdVoice = "Sound over speakers";
    }
}
class Duck extends Bird{
    public Duck{
        this.canBirdFly = false;
        this.birdVoice = "Quack Quack";
    }
}

class BirdFunctions{
    public void makeBirdFly(Bird bird){
        if(bird.canBirdFly)
            System.out.println("Bird can fly ");
        else
            System.out.println("Bird can not fly");
    }
    public void makeBirdSpeak(Bird bird){
        System.out.println("Bird says : " + bird.birdVoice);
    }
}

public class LSPExercise {
    BirdFunctions birdFunctions = new BirdFunctions();
    ToyBird toyBird = new ToyBird();
    Duck duck = new Duck();
    birdFunctions.makeBirdFly(toyBird);
    birdFunctions.makeBirdFly(toyBird);
    birdFunctions.makeBirdSpeak(duck);
    birdFunctions.makeBirdSpeak(duck);

}
