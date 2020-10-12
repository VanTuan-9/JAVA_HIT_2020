package Bai5;

public class Guns
{
    private String weaponName;
    private int ammoName;

    public Guns() {
    }

    public Guns(String weaponName, int ammoName) {
        this.weaponName = weaponName;
        this.ammoName = ammoName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoName() {
        return ammoName;
    }

    public void setAmmoName(int ammoName) {
        this.ammoName = ammoName;
    }

    public void Load(int x)
    {
        ammoName +=x;
    }

    public void Shoot(int x)
    {
        if(ammoName == 0)
            System.out.println("VK hết đạn!");
        if((ammoName - x)>= 0)
            ammoName -=x;
    }

}
