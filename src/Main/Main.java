/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Jogadores.negocio.JogadorImpl;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path enderecoArquivo = Paths.get("C:\\Users\\guilh\\Documentos\\NetBeansProjects\\StreamAPI\\src\\Jogadores\\negocio\\Jogadores.txt");
        JogadorImpl.criaListaJogadores(enderecoArquivo);
        
        System.out.println("Jogador mais velho: "+ JogadorImpl.getJogadorMaisVelho());
        System.out.println("Jogador mais novo: "+ JogadorImpl.getJogadorMaisNovo());
        System.out.println("Média de idades: "+ JogadorImpl.getMediaIdade());
        System.out.println("Artilheiro: "+ JogadorImpl.getArtilheiro());
        System.out.println("Total de gols: "+ JogadorImpl.getSomatorioGols());
        System.out.println("Jogadores por time: "+ JogadorImpl.getJogadoresClube());        
    } 
}
