package ru.otus.java.homework;

public class javaHomework {
    public static void main(String[] args) {
        Plate plate = new Plate(100);

        Cat[] cats = {
                new Cat("Кот1", 10),
                new Cat("Кот2", 20),
                new Cat("Кот3", 30),
                new Cat("Кот4", 5),
                new Cat("Кот5", 25),
                new Cat("Кот6", 20),
                new Cat("Кот7", 5)
        };

        for (int i = 0; i<=6; i++) {
            if (plate.booleanEat(cats[i].appetite)) {
                plate.eat(cats[i].appetite);
                cats[i].eatCat();
            }
            cats[i].appetiteCat();
        }
    }
}

