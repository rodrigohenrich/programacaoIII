/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2Lista;

/**
 *
 * @author rodri
 */
public class Teste1 {
  public static void main(String[] args) {
    Vetor lista = new Vetor(10);
    System.out.println(lista.adiciona("A"));
    System.out.println(lista.adiciona("B"));
    System.out.println(lista.adiciona("C"));
    System.out.println(lista.adiciona("D"));
    System.out.println(lista.adiciona("E"));
    //Teste 2
    System.out.println(lista);
  }
}
