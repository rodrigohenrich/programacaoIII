/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4Lista;

/**
 *
 * @author rodri
 */
public class Teste7 {
  public static void main(String[] args) {
    Vetor lista = new Vetor(10);
    lista.adiciona("A");
    lista.adiciona("B");
    lista.adiciona("C");
    lista.adiciona("D");
    lista.adiciona("E");
    lista.adiciona("F");
    System.out.println(lista);
    System.out.println("Elemento removido: "+lista.removeElemento(1));
    System.out.println(lista);
  }
}
