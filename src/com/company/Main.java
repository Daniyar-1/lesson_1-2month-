package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Bobik");
        dog1.setBreed("Ratfeller");
        dog1.setCommands(new String[]{"Лежать", "Сидеть"});

        Shelter s = new Shelter(" House1 /", "East ");
        Shelter d = new Shelter(" House2 /", "West ");

        Dog dog2 = new Dog("Rax ", "Bulldog ", Color.BLACK, s);

        Dog dog3 = new Dog("Akjoltoi ", " Common ", Color.BROWN, d,
                new String[]{"1 команда", "2 команда"});


        System.out.println(dog1.getInfo());
        dog1.makeVoice("Gav",2);

        System.out.println(dog2.getInfo());
        dog2.makeVoice("Av",4);

        System.out.println(dog3.getInfo());
        dog3.makeVoice("Тяв",5);

    }
}
