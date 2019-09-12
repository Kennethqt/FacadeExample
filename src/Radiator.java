public class Radiator extends CoolingController{
    public boolean on(){
        return true;
    }
    public boolean off(){
        return false;
    }

    public int setSpeed(int speed){
        return speed;
    }
}
