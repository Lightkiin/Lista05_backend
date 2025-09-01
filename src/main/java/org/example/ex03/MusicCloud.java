package org.example.ex03;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis;

    public MusicCloud() {
        this.musicasDisponiveis = new ArrayList<>();
        musicasDisponiveis.add(new Musica("Macarena", "Los Del Rio"));
        musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho & Xororó"));
        musicasDisponiveis.add(new Musica("Shape of You", "Ed Sheeran"));
    }

    public Musica buscarMusica(String titulo) throws Exception {
        for (Musica m : musicasDisponiveis) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        throw new Exception("A música " + titulo + " não foi encontrada no sistema.");
    }
}
