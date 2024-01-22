package ru.otus.java.homework;

public class Cat {
    String  name;
    Integer appetite;
    Boolean satiety;

    public Cat(String name, Integer appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public void eatCat() {
        satiety = true;
    }
    public void appetiteCat() {
        if (satiety) {
            System.out.println(name + " наелся");
        } else {
            System.out.println(name + " голоден");
        }

    }
}