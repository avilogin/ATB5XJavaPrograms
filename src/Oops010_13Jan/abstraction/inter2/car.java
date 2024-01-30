package src.Oops010_13Jan.abstraction.inter2;

public class car implements Engine, Brekes{

    void carWork()
    {
        System.out.println("Car is working fine");
        applyBreak();
        startEngine();
    }

    @Override
    public void applyBreak() {
        System.out.println("Break is working fine");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is running smooth");

    }
}
