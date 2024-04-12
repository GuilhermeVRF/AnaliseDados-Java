/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfacesFuncionais;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class FunctionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> lista = Stream.generate(new Supplier<Integer>() {
            int cont = 0;

            @Override
            public Integer get() {
                return cont++;
            }
        }).limit(10).toList();
        
        Function<Integer, Double> metade = new Function<>() {
            @Override
            public Double apply(Integer num) {
                return num/2.0;
            }
        };
       
        List<Double> listaMetade = lista.stream().map(n -> n/2.0).toList();
        listaMetade.forEach(System.out::println);
        
    }
    
}
