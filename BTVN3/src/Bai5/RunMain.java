package Bai5;

import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Guns gun1 = new Guns("Gun1",10);
        Guns gun2 = new Guns("Gun2",10);
        for(int i =0;;i++)
        {
            Random x = new Random();
            Random y = new Random();
            gun1.Load(5);
            gun2.Load(5);
            int random1 = x.nextInt(4)+4;
            int random2 = y.nextInt(4)+4;
            gun1.Shoot(random1);
            gun2.Shoot(random2);
            System.out.println("Gun1 = "+gun1.getAmmoName());
            System.out.println("Gun2 = "+gun2.getAmmoName());
            if(gun1.getAmmoName() == 0) {
                System.out.println("Gun1 thua!");
                break;
            }
            else if(gun2.getAmmoName() == 0) {
                System.out.println("Gun2 thua!");
                break;
            }
            else if(gun1.getAmmoName() == 0 && gun2.getAmmoName()==0) {
                System.out.println("Hòa!");
                break;
            }
        }
    }
}
