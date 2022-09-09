package com.company;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHp(900);
        boss.setBossDamage(70);
        boss.setG(new Weapons("Automate", "Ak47"));
        System.out.println(boss.printinfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setBossHp(200);
        skeleton.setBossDamage(30);
        skeleton.setArrows(30);

        System.out.println(skeleton.getBossHp() + " " + skeleton.getBossDamage() + " " + skeleton.getArrows());

        Skeleton skeleton2 = new Skeleton();
        skeleton.setBossHp(200);
        skeleton.setBossDamage(30);
        skeleton.setArrows(30);

        System.out.println(skeleton.getBossHp() + " " + skeleton.getBossDamage() + " " + skeleton.getArrows());
    }

}
