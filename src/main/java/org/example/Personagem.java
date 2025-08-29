package org.example;

public class Personagem {
    String nome;
    static Integer vida;
    Integer ataque;

    public Personagem(String nome, Integer vida, Integer ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public Integer getVida() {
        return vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public String status() {
        return "Nome: " + getNome() + " | Vida: " + getVida() + " | Ataque: " + getAtaque();
    }

    public void receberDano(Integer Ataque) {
        int dano = Ataque;
        this.vida -= dano;

        if (getVida() <= 0) {
            System.out.println(this.nome + ", foi derrotado!");
        } else {
            System.out.println("O personagem " + this.nome + " levou " + dano + " de dano");
        }
    }

    public void Atacar(Personagem inimigo) {
        int Ataque = getAtaque();
        inimigo.receberDano(Ataque);
    }
}
