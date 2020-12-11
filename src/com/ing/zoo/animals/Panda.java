package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

public class Panda extends AbstractAnimal implements Herbivore {

    public Panda(String name) {
        this.name = name;
        this.helloText = "kung fu panda";
        this.eatText = "Yum, but give me dumplings";
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
