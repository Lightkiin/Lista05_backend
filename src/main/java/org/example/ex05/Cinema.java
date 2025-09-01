package org.example.ex05;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<String> assentosOcupados;
    private List<Ingresso> ingressosVendidos;

    public Cinema() {
        this.filmesDisponiveis = new ArrayList<>();
        this.assentosOcupados = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nome) throws Exception {
        for (Filme f : filmesDisponiveis) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        throw new Exception("Filme não encontrado!");
    }

    public void venderIngresso(Cliente cliente, Filme filme, String assento) throws Exception {
        if (cliente.getIdade() < filme.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }
        if (assentosOcupados.contains(assento)) {
            throw new Exception("O ingresso não pode ser vendido pois o assento " + assento + " não está mais disponível!");
        }
        assentosOcupados.add(assento);
        Ingresso ingresso = new Ingresso(cliente, filme, assento);
        ingressosVendidos.add(ingresso);
        System.out.println(ingresso);
    }
}
