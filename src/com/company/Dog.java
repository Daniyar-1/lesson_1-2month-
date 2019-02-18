package com.company;

import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog() {}


    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    void makeVoice() {
        System.out.println("Гав-гав!");
    }

    void makeVoice(String voice, int number) {
                for (int i = 0; i<number; i++){
        System.out.println(voice);}
    }
    void makeVoice(int number) {
        for (int i = 0; i<number; i++){
            System.out.println("Pppp-ppp");}

    }
    public String getInfo(){ return super.getInfo()+"/имя ="+name
            + "/порода ="+breed
            +"/команда ="
            +Arrays.toString(commands);}
}
