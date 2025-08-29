package org.example;

public class Main {
    public static void main(String[] args) {
    Personagem brendon = new Personagem("Brendon", 100, 2);
    Personagem inimigo = new Personagem("CLT", 100, 2);

    System.out.println(brendon.status());
    System.out.println(inimigo.status());
    brendon.Atacar(inimigo);
    System.out.println(brendon.status());
    System.out.println(inimigo.status());



    };
}