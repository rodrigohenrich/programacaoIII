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
public class Teste5 {
  public static void main(String[] args) {
    Vetor lista = new Vetor(10);
    lista.adiciona("A");
    lista.adiciona("C");
    lista.adiciona("D");
    lista.adiciona("F");
    System.out.println(lista);
    lista.adiciona(1, "B");
    System.out.println(lista);
    lista.adiciona(4, "E");
    System.out.println(lista);
  }
}
