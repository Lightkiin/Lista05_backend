package org.example.ex04;

public class Fotogram implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) throws Exception {
        throw new Exception("O Fotogram não compartilha postagens de texto!");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse vídeo no Fotogram.");
    }
}
