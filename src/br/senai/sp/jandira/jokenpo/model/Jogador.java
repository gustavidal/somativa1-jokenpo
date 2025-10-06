package br.senai.sp.jandira.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class Jogador {

    int numeroJogada;
    int numeroJogadaComputador;
    String jogada;
    String jogadaComputador;
    String resultado;
    String decisao;
    Scanner leitor = new Scanner(System.in);
    Random random = new Random();

    public void receberNumero(){
        System.out.println("-------------------------------------------");
        System.out.println("-------- VAMOS JOGAR JOKENPÔ! --------");
        System.out.println("-------------------------------------------");
        System.out.println("Escolha uma opção: ");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("-------------------------------------------");
        System.out.print("Digite a sua escolha:  ");
        numeroJogada = leitor.nextInt();
        leitor.nextLine();

        verificarJogada();
    }

    public void verificarJogada(){
        if (numeroJogada == 1){
            jogada = "Pedra";
        } else if (numeroJogada == 2){
            jogada = "Papel";
        } else if (numeroJogada == 3){
            jogada = "Tesoura";
        } else {
            System.out.println("Valor inválido. Jogue novamente.");
            receberNumero();
        }
    }
}
