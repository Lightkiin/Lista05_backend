package org.example.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Titulo:");
        String titulo = sc.nextLine();

        System.out.println("Descrição:");
        String descricao = sc.nextLine();

        System.out.println("Tipo (texto, imagem, video):");
        String tipoStr = sc.nextLine().toUpperCase();
        TipoPostagem tipo = TipoPostagem.valueOf(tipoStr);

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        PlataformaSocial myBook = new MyBook();
        PlataformaSocial fotogram = new Fotogram();
        PlataformaSocial anyTube = new AnyTube();

        try {
            myBook.compartilharPostagem(postagem);
            fotogram.compartilharImagem(postagem);
            anyTube.compartilharVideo(postagem);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        sc.close();
    }
}
