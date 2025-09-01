package org.example.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 12));
        cinema.adicionarFilme(new Filme("Batman", 25.0, 14));
        cinema.adicionarFilme(new Filme("Matrix", 30.0, 16));
        cinema.adicionarFilme(new Filme("O Exorcista", 35.0, 18));
        cinema.adicionarFilme(new Filme("Divertida Mente 2", 22.0, 0));

        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = sc.nextLine();
                Filme filme = cinema.buscarFilme(nomeFilme);

                System.out.println("Qual assento você deseja?");
                String assento = sc.nextLine();

                System.out.println("Qual o seu nome?");
                String nomeCliente = sc.nextLine();

                System.out.println("Qual a sua idade?");
                int idade = Integer.parseInt(sc.nextLine());

                Cliente cliente = new Cliente(nomeCliente, idade);
                cinema.venderIngresso(cliente, filme, assento);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja comprar outro ingresso? (s/n)");
            continuar = sc.nextLine().equalsIgnoreCase("s");
        }

        sc.close();
    }
}
