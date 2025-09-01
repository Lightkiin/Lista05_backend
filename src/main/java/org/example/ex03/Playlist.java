package org.example.ex03;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Você adicionou a música " + musica.getTitulo() + " na playlist.");
    }

    public void mostrarPlaylist() {
        System.out.println("Playlist: " + nome);
        for (Musica m : musicas) {
            System.out.println("- " + m.getTitulo());
        }
    }
}
