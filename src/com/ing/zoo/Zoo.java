package com.ing.zoo;

import com.ing.zoo.animals.Hippo;
import com.ing.zoo.animals.Hyena;
import com.ing.zoo.animals.Lion;
import com.ing.zoo.animals.Panda;
import com.ing.zoo.animals.Pig;
import com.ing.zoo.animals.Tiger;
import com.ing.zoo.animals.Zebra;
import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Performable;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Henk"));
        animals.add(new Hippo("Elsa"));
        animals.add(new Pig("Dora"));
        animals.add(new Tiger("Wally"));
        animals.add(new Zebra("Marty"));
        animals.add(new Panda("remco"));
        animals.add(new Hyena("lili"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        if (input.equals(commands[0])) {
            animals.forEach(Animal::sayHello);
        }

        if (input.startsWith(commands[0])) {
            animals.stream()
                    .filter(animal -> input.equals(commands[0] + " " + animal.getName()))
                    .findFirst()
                    .ifPresent(Animal::sayHello);
        }

        if (input.equals(commands[1])) {
            animals.stream()
                    .filter(animal -> animal instanceof Herbivore)
                    .map(Herbivore.class::cast)
                    .forEach(Herbivore::eatLeaves);
        }

        if (input.equals(commands[2])) {
            animals.stream()
                    .filter(animal -> animal instanceof Carnivore)
                    .map(Carnivore.class::cast)
                    .forEach(Carnivore::eatMeat);
        }

        if (input.equals(commands[3])) {
            animals.stream()
                    .filter(animal -> animal instanceof Performable)
                    .map(Performable.class::cast)
                    .forEach(Performable::performTrick);
        }
    }
}
