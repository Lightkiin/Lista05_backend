package org.example.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicCloud cloud = new MusicCloud();

        System.out.println("Digite o nome da sua playlist:");
        String nomePlaylist = sc.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o nome da música: ");
            String nomeMusica = sc.nextLine();

            try {
                Musica musica = cloud.buscarMusica(nomeMusica);
                playlist.adicionarMusica(musica);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja adicionar mais uma música? (s/n)");
            continuar = sc.nextLine().equalsIgnoreCase("s");
        }

        playlist.mostrarPlaylist();
        sc.close();
    }
}
