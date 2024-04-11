/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Guilherme
 */
public class ConsumerExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
        
        
        System.out.println("1° forma: ");
        Consumer<Integer> numerosPares = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };
        
        numeros.forEach(numerosPares);
        
        System.out.println("2° forma: ");
        
        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if(numero % 2 == 0){
                System.out.println(numero);
            }
            }
        });
        
        System.out.println("3° forma: ");
        numeros.forEach(numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        });
    }
}
