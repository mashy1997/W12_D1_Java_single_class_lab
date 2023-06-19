package classes;

public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public boolean checkVolume(){
        return (this.volume == 100?true:false);
    }

    public void drink(){
        this.volume -= 10;
    }

    public int volOfBottle(){
        return (this.volume);
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
