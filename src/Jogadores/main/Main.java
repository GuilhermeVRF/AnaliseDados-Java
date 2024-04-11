/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogadores.main;

import Jogadores.negocio.JogadorImpl;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Path caminho = Paths.get("C:\\Users\\guilh\\Documentos\\NetBeansProjects\\StreamAPI\\src\\Jogadores\\negocio\\Jogadores.txt");
        JogadorImpl.criaListaJogadores(caminho);
        
        //System.out.println(JogadorImpl.imprimirJogadores());
        System.out.println("Jogador mais novo: "+JogadorImpl.getJogadorMaisNovo());
        System.out.println("Jogador mais velho: "+JogadorImpl.getJogadorMaisVelho());
        System.out.println("Média de idades: "+ JogadorImpl.getMediaIdade());
        System.out.println("Artilheiro: "+JogadorImpl.getArtilheiro());
        System.out.println("Somatório de gols: "+JogadorImpl.getSomatorioGols());
        System.out.println(JogadorImpl.getJogadoresClube());
        System.out.println(JogadorImpl.getJogadoresPosicao());
        System.out.println(JogadorImpl.getJogadoresClube());
    }
}
