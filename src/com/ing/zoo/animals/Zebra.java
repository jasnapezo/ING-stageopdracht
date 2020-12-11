package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

public class Zebra extends AbstractAnimal implements Herbivore {

    public Zebra(String name) {
        this.name = name;
        this.helloText = "zebra zebra";
        this.eatText = "munch munch zank yee bra";
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
