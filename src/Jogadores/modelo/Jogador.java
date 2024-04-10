/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogadores.modelo;

/**
 *
 * @author Guilherme
 */
public class Jogador {
    private String nome;
    private String posicao;
    private int idade;
    private String timeAtual;
    private int golsMarcados;
    
    public Jogador(String nome, String posicao, int idade, String timeAtual, int golsMarcado){
        this.nome = nome;
        this.posicao = posicao;
        this.idade = idade;
        this.timeAtual = timeAtual;
        this.golsMarcados = golsMarcado;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public String getPosicao(){
        return this.posicao;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setTimeAtual(String timeAtual){
        this.timeAtual = timeAtual;
    }
    
    public String getTimeAtual(){
        return this.timeAtual;
    }
    
    public void setGolsMarcados(int golsMarcado){
        this.golsMarcados = golsMarcado;
    }
    
    public int getGolsMarcados(){
        return this.golsMarcados;
    }
    
    @Override
    public String toString(){
        return this.nome +" - "+ this.posicao+ " - " + this.idade +" - " + this.timeAtual;
    }
}
