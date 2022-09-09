package com.company;

public class Skeleton extends Boss{
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public int arrows;

    public int getArrows() {
        return arrows;
    }

    public String printinfo(){
        return super.getBossHp() + getBossDamage() +getG().getTypeWeapon() + getG().getNameWeapon() + getArrows();
    }
}
