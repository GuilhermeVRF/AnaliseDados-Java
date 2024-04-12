/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SimpleAbstractMethod;

/**
 *
 * @author Guilherme
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaiorNumero<Integer> maior = (Integer num1, Integer num2) -> num1 > num2;
        
        System.out.println(maior.éMaior(3, 2));
    }
    
}
