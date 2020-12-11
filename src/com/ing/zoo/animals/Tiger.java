package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Performable;

import java.util.Random;

public class Tiger extends AbstractAnimal implements Carnivore, Performable {
    private String trick;

    public Tiger(String name) {
        this.name = name;
        this.helloText = "rraaarww";
        this.eatText = "nomnomnom oink wubalubadubdub";
    }

    public void sayHello() {
        System.out.println(helloText);
    }

    public void eatMeat() {
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
