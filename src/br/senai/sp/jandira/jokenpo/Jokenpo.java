package br.senai.sp.jandira.jokenpo;

import br.senai.sp.jandira.jokenpo.model.Jogador;

public class Jokenpo {
    public static void main(String[] args) {
        System.out.println("Iniciando o jogo...");

        Jogador partida = new Jogador();

        partida.receberNumero();
    }
}
