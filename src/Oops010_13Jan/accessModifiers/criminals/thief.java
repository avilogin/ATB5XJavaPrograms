package src.Oops010_13Jan.accessModifiers.criminals;

import src.Oops010_13Jan.accessModifiers.police.srCop;

public class thief {
    public static void main(String[] args) {

        srCop  th = new srCop(5);
        System.out.println(th.gun);
        //th.canIShoot(); cannot access as it is protected 
    }
}
