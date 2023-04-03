package com.company;

public class Main {

    public static void main(String[] args) {
	    ISaveable Hunter;
        ISaveable Werewolf;
        Hunter = new Player("Hunter",5,2);
        Werewolf = new Monster("Werewolf",20,40);

        System.out.println(Hunter.toString());
        System.out.println(Werewolf.toString());
    }
}
