package com.vadim19.StudentFood;


public class Dish {
    int price;
    int number;
    String  type;
    String name;

    public Dish(int number, int price, String name) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.price = price;

    }

    public String toString() {
        return String.format(
                "%d. %s по ціні %d",
                this.number,this.name, this.price, this.type
        );
    }

}
