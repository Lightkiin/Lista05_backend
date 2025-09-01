package org.example.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem("Steve", 100, 20);

        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Orc", 100, 10));
        inimigos.add(new Personagem("Goblin", 50, 5));
        inimigos.add(new Personagem("Lobo", 75, 15));
        inimigos.add(new Personagem("Cavaleiro", 200, 20));
        inimigos.add(new Personagem("Dragão", 500, 50));

        Random random = new Random();

        while (jogador.estaVivo() && inimigos.stream().anyMatch(Personagem::estaVivo)) {

            Personagem alvo;
            do {
                alvo = inimigos.get(random.nextInt(inimigos.size()));
            } while (!alvo.estaVivo());

            jogador.atacar(alvo);

            for (Personagem inimigo : inimigos) {
                if (inimigo.estaVivo()) {
                    inimigo.atacar(jogador);
                }
            }

            System.out.println("=====================================");
        }

        if (jogador.estaVivo()) {
            System.out.println("Steve venceu!");
        } else {
            System.out.println("Os inimigos venceram!");
        }
    }
}
