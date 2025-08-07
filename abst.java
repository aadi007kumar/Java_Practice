abstract class Car{
    public abstract void drive();
    public abstract void sink();
    public void playMusic(){
        System.out.println("Music Playing..");
    } 
}
class nano extends Car{
    @Override
    public void drive(){
        System.out.println("Driving..");
    }
    @Override
    public void sink(){
        System.out.println("Sinking..");
    }
}
public class abst{
    public static void main(String[] args) {
        nano obj = new nano();
        obj.drive();
        obj.sink();
        obj.playMusic();

    }
}