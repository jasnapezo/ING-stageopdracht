package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

public class Hippo extends AbstractAnimal implements Herbivore {

    public Hippo(String name) {
        this.name = name;
        this.helloText = "splash";
        this.eatText = "munch munch lovely";
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }

}
