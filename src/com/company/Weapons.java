package com.company;

public class Weapons {
    private String typeWeapon;
    private String nameWeapon;


    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public Weapons(String typeWeapon, String nameWeapon) {
        this.typeWeapon = typeWeapon;
        this.nameWeapon = nameWeapon;
    }

}
