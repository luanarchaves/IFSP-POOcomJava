/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ant.maven;

/**
 *
 * @author luana
 */
public class A02t03 {
    public static void main(String[] args) {
        Double restoDivisao = (Double.parseDouble(args[0]) % Double.parseDouble(args[1]));
        System.out.println("Resto de divisão: "+restoDivisao);
        
        Double produto = (Double.parseDouble(args[0]) * Double.parseDouble(args[1]));
        System.out.println("Produto: "+produto);
        
        Double media = (Double.parseDouble(args[0]) + Double.parseDouble(args[1])) / 2;
        System.out.println("Média: "+media);


    }
}
