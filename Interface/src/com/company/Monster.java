package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> items= new ArrayList<>();
        items.add(0,name);
        items.add(1,""+hitPoints);
        items.add(2,""+strength);

        return items;
    }

    @Override
    public void read(List<String> list) {
        if(list!=null&&list.size()>0){
            name=list.get(0);
            hitPoints=Integer.parseInt(list.get(1));
            strength=Integer.parseInt(list.get(2));
        }
    }
    @Override
    public String toString(){
        return "Monster{name='"+getName()+"', hitPoints="+getHitPoints()+", strength='"+getStrength()+"'}";
    }
}
