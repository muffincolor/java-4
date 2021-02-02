package com.company;

public class Main {

    public static int counter = 0;

    public static void main(String[] args) {
        Cat catVaska = new Cat("Васька");
        Dog dogBobik = new Dog("Бобик");

        catVaska.run(200);
        dogBobik.run(2000);
        dogBobik.run(100);
        catVaska.swim(400);

        System.out.println("Всего животных: " + counter);
    }

    public static class Animal {
        public String name;
        public int swimMetersMax;
        public int runMetersMax;

        public Animal(String name, int swimMetersMax, int runMetersMax) {
            this.name = name;
            this.swimMetersMax = swimMetersMax;
            this.runMetersMax = runMetersMax;
            counter += 1;
        }

        public void swim(int meters) {
            System.out.println("Я проплыл " + meters);
        }

        public void run(int meters) {
            System.out.println("Я пробежал " + meters);
        }
    }

    public static class Cat extends Animal {
        public Cat(String name) {
            super(name, 0, 200);
        }

        @Override
        public void swim(int meters) {
            System.out.println("Так-то кошки не плавают...");
        }

        @Override
        public void run(int meters) {
            if(meters > this.runMetersMax) {
                System.out.println(this.name + " пробежал " + meters + " м.");
            } else {
                System.out.println("Это тяжело. Попробуй поменьше.");
            }
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name, 10, 500);
        }

        @Override
        public void swim(int meters) {
            if(meters > this.swimMetersMax) {
                System.out.println(this.name + " проплыл " + meters + " м.");
            } else {
                System.out.println("Это тяжело. Попробуй поменьше.");
            }
        }

        @Override
        public void run(int meters) {
            if(meters > this.runMetersMax) {
                System.out.println(this.name + " пробежал " + meters + " м.");
            } else {
                System.out.println("Это тяжело. Попробуй поменьше.");
            }
        }
    }
}