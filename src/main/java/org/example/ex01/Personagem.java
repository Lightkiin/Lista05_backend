package org.example.ex01;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        if (!estaVivo()) {
            System.out.println(nome + " já está derrotado!");
            return;
        }

        vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        } else {
            System.out.println(nome + " levou " + dano + " de dano. Vida restante: " + vida);
        }
    }

    public void atacar(Personagem alvo) {
        if (!estaVivo()) {
            System.out.println(nome + " não pode atacar porque foi derrotado!");
            return;
        }
        if (!alvo.estaVivo()) {
            System.out.println("O ataque de " + nome + " falhou, pois " + alvo.getNome() + " já está derrotado!");
            return;
        }
        alvo.receberDano(this.ataque);
    }

    public String status() {
        return "Nome: " + nome + " | Vida: " + vida + " | Ataque: " + ataque;
    }
}
