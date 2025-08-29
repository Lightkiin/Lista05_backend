package org.example;

public class Main {
    public static void main(String[] args) {
    Personagem brendon = new Personagem("Brendon", 100, 2);
    System.out.println(brendon.status());
    brendon.receberDano(10);
    System.out.println(brendon.status());
    };
}