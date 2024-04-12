/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfacesFuncionais;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author Guilherme
 */
public class PredicateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> cpfFormatados = Stream.generate(() -> teclado.nextLine()).limit(5)
                .filter(cpf -> cpf.length() == 11)
                .map(cpf
                -> cpf.subSequence(0, 3) + "."
                + cpf.subSequence(3, 6) + "."
                + cpf.subSequence(6, 9) + "-"
                + cpf.subSequence(9, 11)
                ).toList();
        
        cpfFormatados.forEach(System.out::println);
                
    }
    
}
