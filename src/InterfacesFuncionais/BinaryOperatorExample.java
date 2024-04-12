/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfacesFuncionais;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class BinaryOperatorExample {

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
        }).limit(100).toList();
        
        System.out.println(lista.stream().anyMatch(num -> num == 1));
        List<Integer> listaPares = lista.stream().filter(num -> num % 2 == 0).toList();
        
        BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
        
        System.out.println(listaPares.stream().reduce((num1,num2) -> num1 + num2).get());
    }
    
}
