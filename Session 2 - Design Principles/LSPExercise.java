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

class ToyBird extends Bird{
    public ToyBird(){
        this.setCanBirdFly(false);
        this.setBirdVoice("Sound over speakers");
    }
}
class Duck extends Bird{
    public Duck(){
        this.setCanBirdFly(false);
        this.setBirdVoice("Quack Quack");
    }
}

class BirdFunctions{
    public void makeBirdFly(Duck duck){
        if(duck.isCanBirdFly())
            System.out.println("Bird can fly ");
        else
            System.out.println("Bird can not fly");
    }
    public void makeBirdSpeak(ToyBird toyBird){
        System.out.println("Bird says : " + toyBird.getBirdVoice());
    }
}

public class LSPExercise {
    BirdFunctions birdFunctions = new BirdFunctions();
    ToyBird toyBird = new ToyBird();
    Duck duck = new Duck();

}
