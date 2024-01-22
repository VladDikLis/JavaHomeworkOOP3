package ru.otus.java.homework;

public class Plate {
    Integer maxFood;
    Integer food;

    public Plate(Integer maxFood) {
        this.maxFood = maxFood;
        this.food = maxFood;
    }

    public void addFood() {
        food = maxFood;
    }

    public boolean booleanEat(Integer appetite) {
        boolean a = true;
        if (food < appetite) {
            a = false;
        }
        return a;
    }

    public void eat(Integer appetite) {
        food = food - appetite;
    }
}