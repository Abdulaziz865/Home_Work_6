package com.company;

public class Boss extends GameEntity{
    private Weapons G;

    public Weapons getG() {
        return G;
    }

    public void setG(Weapons g) {
        G = g;
    }

    public String printinfo() {
        return getBossHp() + " " + getBossDamage() + " " + getG().getTypeWeapon() +" "+ getG().getNameWeapon();

    }
}
