package org.example.ex04;

public class AnyTube implements PlataformaSocial {
    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) throws Exception {
        throw new Exception("O AnyTube não compartilha imagens!");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse vídeo no AnyTube.");
    }
}
