package src.Oops010_13Jan.accessModifiers.police;

public class srCop {

    public int gun;

    public srCop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot()
    {
        System.out.println("Yes you can shoot..!!!");
    }
}
