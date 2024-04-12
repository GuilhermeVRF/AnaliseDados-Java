/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SimpleAbstractMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        List<Integer> lista = Arrays.asList(1,2,3);
        
        Predicado<Integer> numPar = num -> num % 2 == 0;
        Suplemento<String> criarNomes =  () -> tec.nextLine();
        Consumidor<String> exibirNomes = nome -> System.out.println(nome);
        Função<String,Double> converterStr_Double = numeroSTR -> Double.valueOf(numeroSTR);
        OperadorBinario<Integer> somar = (num1,num2) -> num1 + num2;   
        
        exibirNomes.aceitar(criarNomes.get());
        System.out.println("Convertendo número: " + converterStr_Double.apply("10.5"));
        System.out.println("É numero par? " + numPar.testar(8));
        System.out.println("Soma: " + somar.apply(120, 100));
        
        int soma = 0;
        for(int i = 0;i< lista.size();i += 2){
            if(i + 1 < lista.size())
                soma += somar.apply(lista.get(i), lista.get(i + 1));
            else
                soma += somar.apply(lista.get(i), 0);
        }
        
        System.out.println(soma);
    }
    
}
