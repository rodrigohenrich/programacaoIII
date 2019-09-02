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
public class Teste3 {
  public static void main(String[] args) {
    Vetor lista = new Vetor(10);
    lista.adiciona("Elemento 1");
    lista.adiciona("Elemento 2");
    lista.adiciona("Elemento 3");
    lista.adiciona("Elemento 4");
    lista.adiciona("Elemento 5");
    System.out.println(lista.obterElemento(2));
  }
}
