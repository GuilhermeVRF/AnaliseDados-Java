/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfacesFuncionais;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class SupplierExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> lista;
        
        System.out.println("1° forma: ");
        Supplier<String> frases = () -> {
            return teclado.nextLine();
        };
        
        lista = Stream.generate(frases).limit(3).toList();
        lista.forEach(palavra -> System.out.println(palavra));
        
        System.out.println("2° forma: ");
        lista = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return teclado.nextLine();
            }
        }).limit(3).toList();
        
        lista.forEach(System.out::println);
    
        System.out.println("3° forma: ");
        lista = Stream.generate(()-> teclado.nextLine()).limit(3).toList();
        
        lista.forEach(System.out::println);
    }
}
