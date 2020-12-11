package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performable;

import java.util.Random;

public class Pig extends AbstractAnimal implements Carnivore, Herbivore, Performable {
    private String trick;

    public Pig(String name) {
        this.name = name;
        this.helloText = "splash";
    }

    public void sayHello() {
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
