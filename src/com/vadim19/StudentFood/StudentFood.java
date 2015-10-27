package com.vadim19.StudentFood;

import java.util.Scanner;

public class StudentFood {
    public static void main(String[] args) {
        int money;
        int yourMoney;
        int res;
        int res2;
        Scanner scanner = new Scanner(System.in);
        Dish[] dishs = new Dish[10];
        dishs[0] = new Dish(1, 15, "Пюре");
        dishs[1] = new Dish(2, 13, "Каша");
        dishs[2] = new Dish(3, 15,"Бограч");
        dishs[3] = new Dish(4, 13, "Котлета");
        dishs[4] = new Dish(5, 8,"Підлива з грибами");
        dishs[5] = new Dish(6, 11, "Олівє");
        dishs[6] = new Dish(7, 5,"Тістечко");
        dishs[7] = new Dish(8, 12,"Гамбургер");
        dishs[8] = new Dish(9, 8,"Пепсі");
        dishs[9] = new Dish(10, 6, "Сок");
        for (int i = 0; i < dishs.length; i++) {
            System.out.println(dishs[i]);
        }
        System.out.println("Скільки у вас грошей?");
        money = Integer.parseInt(scanner.nextLine());
        yourMoney = money;
        System.out.println("Що будете брати?");
        res = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (money >= dishs[res - 1].price) {
                money = money - dishs[res - 1].price;
                System.out.println("Скільки порцій ви бажаєте?");
                res2 = Integer.parseInt(scanner.nextLine());
                if (res2 >= 1)
                    if (money >= (res2 - 1) * dishs[res - 1].price) {
                        money = money - (res2 - 1) * (dishs[res - 1].price);
                    } else {
                        money = money + (dishs[res - 1].price);
                        System.out.println("У вас тільки " + money + "грн" + " ви не можете це придбати");
                        System.out.println("З вас " + (yourMoney - money) + "грн");
                    }
                else {
                    money = money - (res2 - 1) * (dishs[res - 1].price);
                }

                System.out.println("Щось ще будете брати?     " + "У вас залишилось " + money + "грн");
                res = Integer.parseInt(scanner.nextLine());
            } else {
                System.out.println("У вас тільки " + money + "грн" + " ви не можете це придбати");
                System.out.println("З вас " + (yourMoney - money) + "грн");
                break;
            }

            if (res == 0) {
                System.out.println("З вас " + (yourMoney - money) + "грн");
                break;
            }
        }
    }
}
