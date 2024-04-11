/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogadores.negocio;

import Jogadores.modelo.Jogador;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class JogadorImpl {
    private static List<Jogador> listaJogadores = new ArrayList<>();
    public static boolean verificarExistenciaArquivo(Path caminho){
        try{
            Stream<Path> arquivos = Files.list(caminho);
            Optional<Path> jogadoresTXT = arquivos.filter(arquivo -> arquivo.toString().endsWith("Jogadores.txt")).findAny();
            return jogadoresTXT.isPresent();
        }catch(IOException err){
            System.out.println("Erro!");
        }
        
        return false;
    }
    
    public static void criaListaJogadores(Path caminho){    
        try {
            Stream<String> linhas = Files.lines(caminho);
            List<String> listaLinhas = linhas.collect(Collectors.toList());
            
            listaLinhas.forEach(linha -> {
                String[] dado = linha.split(", ");
                listaJogadores.add(new Jogador(dado[0], dado[1], Integer.parseInt(dado[2]), dado[3], Integer.parseInt(dado[4])));
            });
        } catch (IOException ex) {
            Logger.getLogger(JogadorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String imprimirJogadores(){
        String saida = "";
        for(Jogador jogador : listaJogadores){
            saida += jogador.toString() + "\n"; 
        }
        
        return saida;
    }
    
    public static int contarJogadores(){
        return listaJogadores.size();
    }
    
    public static long contarJogadoresTime(String time){      
        return listaJogadores.stream().filter(jogador -> jogador.getTimeAtual().equals(time)).count();
    }
    
    public static Map<String, List<String>> getJogadoresClube(){
        Map<String, List<String>> jogadoresTime = listaJogadores.stream().collect(Collectors.groupingBy(Jogador::getTimeAtual, Collectors.mapping(Jogador::getNome, Collectors.toList())));
        
        return jogadoresTime;
    }
    
    public static Jogador getJogadorMaisNovo(){
        
        return listaJogadores.stream().min(Comparator.comparing(Jogador::getIdade)).get();
    }
    
    public static Jogador getJogadorMaisVelho(){
        return listaJogadores.stream().max(Comparator.comparing(Jogador::getIdade)).get();
    }
    
    public static double getMediaIdade(){
        return listaJogadores.stream().mapToInt(Jogador::getIdade).average().getAsDouble();
    }
    
    public static Map<String, List<Jogador>> getJogadoresPosicao(){
        return listaJogadores.stream().collect(Collectors.groupingBy(Jogador::getPosicao));
    }
    
    public static long getSomatorioGols(){
        return listaJogadores.stream().mapToInt(Jogador::getGolsMarcados).sum();
    }
    
    public static Jogador getArtilheiro(){
        return listaJogadores.stream().max(Comparator.comparing(Jogador::getGolsMarcados)).get();
    }
    
    public static Map<String, Long> getNumPosicao(){
        return listaJogadores.stream().collect(Collectors.groupingBy(jogador -> jogador.getPosicao(), Collectors.counting())); 
    }
}
