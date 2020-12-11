package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;

public class Lion extends AbstractAnimal implements Carnivore {

    public Lion(String name) {
        this.name = name;
        this.helloText = "roooaoaaaaar";
        this.eatText = "nomnomnom thx mate";
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
