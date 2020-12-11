package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;

public class Hyena extends AbstractAnimal implements Carnivore {

    public Hyena(String name) {
        this.name = name;
        this.helloText = "hihihihihihi";
        this.eatText = "nomnomnom Simba tastes awsome";
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }
}
